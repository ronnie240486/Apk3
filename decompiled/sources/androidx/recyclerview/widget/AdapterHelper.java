package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
final class AdapterHelper implements androidx.recyclerview.widget.OpReorderer.Callback {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "AHT";
    public final androidx.recyclerview.widget.AdapterHelper.Callback mCallback;
    public final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    public final androidx.recyclerview.widget.OpReorderer mOpReorderer;
    public final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mPendingUpdates;
    public final java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mPostponedList;
    private androidx.core.util.Pools.Pool<androidx.recyclerview.widget.AdapterHelper.UpdateOp> mUpdateOpPool;

    /* JADX INFO: loaded from: classes.dex */
    public interface Callback {
        androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolder(int r1);

        void markViewHoldersUpdated(int r1, int r2, java.lang.Object r3);

        void offsetPositionsForAdd(int r1, int r2);

        void offsetPositionsForMove(int r1, int r2);

        void offsetPositionsForRemovingInvisible(int r1, int r2);

        void offsetPositionsForRemovingLaidOutOrNewView(int r1, int r2);

        void onDispatchFirstPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);

        void onDispatchSecondPass(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class UpdateOp {
        public int cmd;
        public int itemCount;
        public java.lang.Object payload;
        public int positionStart;

        public UpdateOp(int r1, int r2, int r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.cmd = r1
                r0.positionStart = r2
                r0.itemCount = r3
                r0.payload = r4
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof androidx.recyclerview.widget.AdapterHelper.UpdateOp
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r5
                int r1 = r4.cmd
                int r3 = r5.cmd
                if (r1 == r3) goto L13
                return r2
            L13:
                r3 = 8
                if (r1 != r3) goto L2f
                int r1 = r4.itemCount
                int r3 = r4.positionStart
                int r1 = r1 - r3
                int r1 = java.lang.Math.abs(r1)
                if (r1 != r0) goto L2f
                int r1 = r4.itemCount
                int r3 = r5.positionStart
                if (r1 != r3) goto L2f
                int r1 = r4.positionStart
                int r3 = r5.itemCount
                if (r1 != r3) goto L2f
                return r0
            L2f:
                int r1 = r4.itemCount
                int r3 = r5.itemCount
                if (r1 == r3) goto L36
                return r2
            L36:
                int r1 = r4.positionStart
                int r3 = r5.positionStart
                if (r1 == r3) goto L3d
                return r2
            L3d:
                java.lang.Object r1 = r4.payload
                if (r1 == 0) goto L4a
                java.lang.Object r5 = r5.payload
                boolean r5 = r1.equals(r5)
                if (r5 != 0) goto L4f
                return r2
            L4a:
                java.lang.Object r5 = r5.payload
                if (r5 == 0) goto L4f
                return r2
            L4f:
                return r0
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.cmd
                int r0 = r0 * 31
                int r1 = r2.positionStart
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.itemCount
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = java.lang.System.identityHashCode(r3)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = "["
                r0.append(r1)
                int r1 = r3.cmd
                r2 = 1
                if (r1 == r2) goto L32
                r2 = 2
                if (r1 == r2) goto L2e
                r2 = 4
                if (r1 == r2) goto L2a
                r2 = 8
                if (r1 == r2) goto L27
                java.lang.String r1 = "??"
                goto L34
            L27:
                java.lang.String r1 = "mv"
                goto L34
            L2a:
                java.lang.String r1 = "up"
                goto L34
            L2e:
                java.lang.String r1 = "rm"
                goto L34
            L32:
                java.lang.String r1 = "add"
            L34:
                r0.append(r1)
                java.lang.String r1 = ",s:"
                r0.append(r1)
                int r1 = r3.positionStart
                r0.append(r1)
                java.lang.String r1 = "c:"
                r0.append(r1)
                int r1 = r3.itemCount
                r0.append(r1)
                java.lang.String r1 = ",p:"
                r0.append(r1)
                java.lang.Object r1 = r3.payload
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public AdapterHelper(androidx.recyclerview.widget.AdapterHelper.Callback r3) {
            r2 = this;
            r2.<init>()
            androidx.core.util.Pools$SimplePool r0 = new androidx.core.util.Pools$SimplePool
            r1 = 30
            r0.<init>(r1)
            r2.mUpdateOpPool = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingUpdates = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPostponedList = r0
            r0 = 0
            r2.mExistingUpdateTypes = r0
            r2.mCallback = r3
            r2.mDisableRecycler = r0
            androidx.recyclerview.widget.OpReorderer r3 = new androidx.recyclerview.widget.OpReorderer
            r3.<init>(r2)
            r2.mOpReorderer = r3
            return
    }

    private void applyAdd(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1) {
            r0 = this;
            r0.postponeAndUpdateViewHolders(r1)
            return
    }

    private void applyMove(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1) {
            r0 = this;
            r0.postponeAndUpdateViewHolders(r1)
            return
    }

    private void applyRemove(androidx.recyclerview.widget.AdapterHelper.UpdateOp r11) {
            r10 = this;
            int r0 = r11.positionStart
            int r1 = r11.itemCount
            int r1 = r1 + r0
            r2 = 0
            r3 = -1
            r4 = r0
            r5 = 0
        L9:
            r6 = 0
            r7 = 2
            if (r4 >= r1) goto L43
            androidx.recyclerview.widget.AdapterHelper$Callback r8 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r8 = r8.findViewHolder(r4)
            r9 = 1
            if (r8 != 0) goto L2b
            boolean r8 = r10.canFindInPreLayout(r4)
            if (r8 == 0) goto L1d
            goto L2b
        L1d:
            if (r3 != r9) goto L28
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = r10.obtainUpdateOp(r7, r0, r5, r6)
            r10.postponeAndUpdateViewHolders(r3)
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            r6 = 0
            goto L38
        L2b:
            if (r3 != 0) goto L36
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = r10.obtainUpdateOp(r7, r0, r5, r6)
            r10.dispatchAndUpdateViewHolders(r3)
            r3 = 1
            goto L37
        L36:
            r3 = 0
        L37:
            r6 = 1
        L38:
            if (r3 == 0) goto L3e
            int r4 = r4 - r5
            int r1 = r1 - r5
            r5 = 1
            goto L40
        L3e:
            int r5 = r5 + 1
        L40:
            int r4 = r4 + r9
            r3 = r6
            goto L9
        L43:
            int r1 = r11.itemCount
            if (r5 == r1) goto L4e
            r10.recycleUpdateOp(r11)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r11 = r10.obtainUpdateOp(r7, r0, r5, r6)
        L4e:
            if (r3 != 0) goto L54
            r10.dispatchAndUpdateViewHolders(r11)
            goto L57
        L54:
            r10.postponeAndUpdateViewHolders(r11)
        L57:
            return
    }

    private void applyUpdate(androidx.recyclerview.widget.AdapterHelper.UpdateOp r10) {
            r9 = this;
            int r0 = r10.positionStart
            int r1 = r10.itemCount
            int r1 = r1 + r0
            r2 = 0
            r3 = -1
            r3 = r0
            r4 = -1
            r5 = 0
        La:
            r6 = 4
            if (r0 >= r1) goto L3e
            androidx.recyclerview.widget.AdapterHelper$Callback r7 = r9.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = r7.findViewHolder(r0)
            r8 = 1
            if (r7 != 0) goto L2c
            boolean r7 = r9.canFindInPreLayout(r0)
            if (r7 == 0) goto L1d
            goto L2c
        L1d:
            if (r4 != r8) goto L2a
            java.lang.Object r4 = r10.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = r9.obtainUpdateOp(r6, r3, r5, r4)
            r9.postponeAndUpdateViewHolders(r3)
            r3 = r0
            r5 = 0
        L2a:
            r4 = 0
            goto L3a
        L2c:
            if (r4 != 0) goto L39
            java.lang.Object r4 = r10.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = r9.obtainUpdateOp(r6, r3, r5, r4)
            r9.dispatchAndUpdateViewHolders(r3)
            r3 = r0
            r5 = 0
        L39:
            r4 = 1
        L3a:
            int r5 = r5 + r8
            int r0 = r0 + 1
            goto La
        L3e:
            int r0 = r10.itemCount
            if (r5 == r0) goto L4b
            java.lang.Object r0 = r10.payload
            r9.recycleUpdateOp(r10)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r10 = r9.obtainUpdateOp(r6, r3, r5, r0)
        L4b:
            if (r4 != 0) goto L51
            r9.dispatchAndUpdateViewHolders(r10)
            goto L54
        L51:
            r9.postponeAndUpdateViewHolders(r10)
        L54:
            return
    }

    private boolean canFindInPreLayout(int r8) {
            r7 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r7.mPostponedList
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3c
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r7.mPostponedList
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r4 = r3.cmd
            r5 = 8
            r6 = 1
            if (r4 != r5) goto L24
            int r3 = r3.itemCount
            int r4 = r2 + 1
            int r3 = r7.findPositionOffset(r3, r4)
            if (r3 != r8) goto L39
            return r6
        L24:
            if (r4 != r6) goto L39
            int r4 = r3.positionStart
            int r3 = r3.itemCount
            int r3 = r3 + r4
        L2b:
            if (r4 >= r3) goto L39
            int r5 = r2 + 1
            int r5 = r7.findPositionOffset(r4, r5)
            if (r5 != r8) goto L36
            return r6
        L36:
            int r4 = r4 + 1
            goto L2b
        L39:
            int r2 = r2 + 1
            goto L8
        L3c:
            return r1
    }

    private void dispatchAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp r13) {
            r12 = this;
            int r0 = r13.cmd
            r1 = 1
            if (r0 == r1) goto L85
            r2 = 8
            if (r0 == r2) goto L85
            int r2 = r13.positionStart
            int r0 = r12.updatePositionWithPostponed(r2, r0)
            int r2 = r13.positionStart
            int r3 = r13.cmd
            r4 = 2
            r5 = 4
            r6 = 0
            if (r3 == r4) goto L33
            if (r3 != r5) goto L1c
            r3 = 1
            goto L34
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "op should be remove or update."
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13)
            throw r0
        L33:
            r3 = 0
        L34:
            r7 = 1
            r8 = 1
        L36:
            int r9 = r13.itemCount
            if (r7 >= r9) goto L71
            int r9 = r13.positionStart
            int r10 = r3 * r7
            int r10 = r10 + r9
            int r9 = r13.cmd
            int r9 = r12.updatePositionWithPostponed(r10, r9)
            int r10 = r13.cmd
            if (r10 == r4) goto L53
            if (r10 == r5) goto L4d
        L4b:
            r11 = 0
            goto L56
        L4d:
            int r11 = r0 + 1
            if (r9 != r11) goto L4b
        L51:
            r11 = 1
            goto L56
        L53:
            if (r9 != r0) goto L4b
            goto L51
        L56:
            if (r11 == 0) goto L5b
            int r8 = r8 + 1
            goto L6e
        L5b:
            java.lang.Object r11 = r13.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r12.obtainUpdateOp(r10, r0, r8, r11)
            r12.dispatchFirstPassAndUpdateViewHolders(r0, r2)
            r12.recycleUpdateOp(r0)
            int r0 = r13.cmd
            if (r0 != r5) goto L6c
            int r2 = r2 + r8
        L6c:
            r0 = r9
            r8 = 1
        L6e:
            int r7 = r7 + 1
            goto L36
        L71:
            java.lang.Object r1 = r13.payload
            r12.recycleUpdateOp(r13)
            if (r8 <= 0) goto L84
            int r13 = r13.cmd
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r13 = r12.obtainUpdateOp(r13, r0, r8, r1)
            r12.dispatchFirstPassAndUpdateViewHolders(r13, r2)
            r12.recycleUpdateOp(r13)
        L84:
            return
        L85:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "should not dispatch add or move for pre layout"
            r13.<init>(r0)
            throw r13
    }

    private void postponeAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r3.mPostponedList
            r0.add(r4)
            int r0 = r4.cmd
            r1 = 1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L41
            r1 = 4
            if (r0 == r1) goto L35
            r1 = 8
            if (r0 != r1) goto L1e
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r4 = r4.itemCount
            r0.offsetPositionsForMove(r1, r4)
            goto L54
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown update op type for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r2 = r4.itemCount
            java.lang.Object r4 = r4.payload
            r0.markViewHoldersUpdated(r1, r2, r4)
            goto L54
        L41:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r4 = r4.itemCount
            r0.offsetPositionsForRemovingLaidOutOrNewView(r1, r4)
            goto L54
        L4b:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r3.mCallback
            int r1 = r4.positionStart
            int r4 = r4.itemCount
            r0.offsetPositionsForAdd(r1, r4)
        L54:
            return
    }

    private int updatePositionWithPostponed(int r9, int r10) {
            r8 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r8.mPostponedList
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L82
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r8.mPostponedList
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r4 = r3.cmd
            r5 = 2
            if (r4 != r2) goto L62
            int r2 = r3.positionStart
            int r4 = r3.itemCount
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L4a
            if (r9 > r7) goto L4a
            if (r6 != r2) goto L3a
            if (r10 != r1) goto L31
            int r4 = r4 + 1
            r3.itemCount = r4
            goto L37
        L31:
            if (r10 != r5) goto L37
            int r4 = r4 + (-1)
            r3.itemCount = r4
        L37:
            int r9 = r9 + 1
            goto L7f
        L3a:
            if (r10 != r1) goto L41
            int r2 = r2 + 1
            r3.positionStart = r2
            goto L47
        L41:
            if (r10 != r5) goto L47
            int r2 = r2 + (-1)
            r3.positionStart = r2
        L47:
            int r9 = r9 + (-1)
            goto L7f
        L4a:
            if (r9 >= r2) goto L7f
            if (r10 != r1) goto L57
            int r2 = r2 + 1
            r3.positionStart = r2
            int r4 = r4 + 1
            r3.itemCount = r4
            goto L7f
        L57:
            if (r10 != r5) goto L7f
            int r2 = r2 + (-1)
            r3.positionStart = r2
            int r4 = r4 + (-1)
            r3.itemCount = r4
            goto L7f
        L62:
            int r2 = r3.positionStart
            if (r2 > r9) goto L72
            if (r4 != r1) goto L6c
            int r2 = r3.itemCount
            int r9 = r9 - r2
            goto L7f
        L6c:
            if (r4 != r5) goto L7f
            int r2 = r3.itemCount
            int r9 = r9 + r2
            goto L7f
        L72:
            if (r10 != r1) goto L79
            int r2 = r2 + 1
            r3.positionStart = r2
            goto L7f
        L79:
            if (r10 != r5) goto L7f
            int r2 = r2 + (-1)
            r3.positionStart = r2
        L7f:
            int r0 = r0 + (-1)
            goto L8
        L82:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r10 = r8.mPostponedList
            int r10 = r10.size()
            int r10 = r10 - r1
        L89:
            if (r10 < 0) goto Lb7
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r8.mPostponedList
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r0
            int r1 = r0.cmd
            if (r1 != r2) goto La8
            int r1 = r0.itemCount
            int r3 = r0.positionStart
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto Lb4
        L9f:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r8.mPostponedList
            r1.remove(r10)
            r8.recycleUpdateOp(r0)
            goto Lb4
        La8:
            int r1 = r0.itemCount
            if (r1 > 0) goto Lb4
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r8.mPostponedList
            r1.remove(r10)
            r8.recycleUpdateOp(r0)
        Lb4:
            int r10 = r10 + (-1)
            goto L89
        Lb7:
            return r9
    }

    public int applyPendingUpdatesToPosition(int r6) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPendingUpdates
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L47
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r5.mPendingUpdates
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r2
            int r3 = r2.cmd
            r4 = 1
            if (r3 == r4) goto L3d
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 8
            if (r3 == r4) goto L1e
            goto L44
        L1e:
            int r3 = r2.positionStart
            if (r3 != r6) goto L25
            int r6 = r2.itemCount
            goto L44
        L25:
            if (r3 >= r6) goto L29
            int r6 = r6 + (-1)
        L29:
            int r2 = r2.itemCount
            if (r2 > r6) goto L44
            int r6 = r6 + 1
            goto L44
        L30:
            int r3 = r2.positionStart
            if (r3 > r6) goto L44
            int r2 = r2.itemCount
            int r3 = r3 + r2
            if (r3 <= r6) goto L3b
            r6 = -1
            return r6
        L3b:
            int r6 = r6 - r2
            goto L44
        L3d:
            int r3 = r2.positionStart
            if (r3 > r6) goto L44
            int r2 = r2.itemCount
            int r6 = r6 + r2
        L44:
            int r1 = r1 + 1
            goto L7
        L47:
            return r6
    }

    public final void consumePostponedUpdates() {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPostponedList
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1a
            androidx.recyclerview.widget.AdapterHelper$Callback r3 = r5.mCallback
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r4 = r5.mPostponedList
            java.lang.Object r4 = r4.get(r2)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r4
            r3.onDispatchSecondPass(r4)
            int r2 = r2 + 1
            goto L8
        L1a:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPostponedList
            r5.recycleUpdateOpsAndClearList(r0)
            r5.mExistingUpdateTypes = r1
            return
    }

    public final void consumeUpdatesInOnePass() {
            r7 = this;
            r7.consumePostponedUpdates()
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r7.mPendingUpdates
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L65
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r3 = r7.mPendingUpdates
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r4 = r3.cmd
            r5 = 1
            if (r4 == r5) goto L54
            r5 = 2
            if (r4 == r5) goto L45
            r5 = 4
            if (r4 == r5) goto L34
            r5 = 8
            if (r4 == r5) goto L25
            goto L62
        L25:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r3 = r3.itemCount
            r4.offsetPositionsForMove(r5, r3)
            goto L62
        L34:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r6 = r3.itemCount
            java.lang.Object r3 = r3.payload
            r4.markViewHoldersUpdated(r5, r6, r3)
            goto L62
        L45:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r3 = r3.itemCount
            r4.offsetPositionsForRemovingInvisible(r5, r3)
            goto L62
        L54:
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            r4.onDispatchSecondPass(r3)
            androidx.recyclerview.widget.AdapterHelper$Callback r4 = r7.mCallback
            int r5 = r3.positionStart
            int r3 = r3.itemCount
            r4.offsetPositionsForAdd(r5, r3)
        L62:
            int r2 = r2 + 1
            goto Lb
        L65:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r7.mPendingUpdates
            r7.recycleUpdateOpsAndClearList(r0)
            r7.mExistingUpdateTypes = r1
            return
    }

    public final void dispatchFirstPassAndUpdateViewHolders(androidx.recyclerview.widget.AdapterHelper.UpdateOp r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r2.mCallback
            r0.onDispatchFirstPass(r3)
            int r0 = r3.cmd
            r1 = 2
            if (r0 == r1) goto L1f
            r1 = 4
            if (r0 != r1) goto L17
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r2.mCallback
            int r1 = r3.itemCount
            java.lang.Object r3 = r3.payload
            r0.markViewHoldersUpdated(r4, r1, r3)
            goto L26
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "only remove and update ops can be dispatched in first pass"
            r3.<init>(r4)
            throw r3
        L1f:
            androidx.recyclerview.widget.AdapterHelper$Callback r0 = r2.mCallback
            int r3 = r3.itemCount
            r0.offsetPositionsForRemovingInvisible(r4, r3)
        L26:
            return
    }

    public final int findPositionOffset(int r6, int r7) {
            r5 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPostponedList
            int r0 = r0.size()
        L6:
            if (r7 >= r0) goto L41
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r5.mPostponedList
            java.lang.Object r1 = r1.get(r7)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r1 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r1
            int r2 = r1.cmd
            r3 = 8
            if (r2 != r3) goto L28
            int r2 = r1.positionStart
            if (r2 != r6) goto L1d
            int r6 = r1.itemCount
            goto L3e
        L1d:
            if (r2 >= r6) goto L21
            int r6 = r6 + (-1)
        L21:
            int r1 = r1.itemCount
            if (r1 > r6) goto L3e
            int r6 = r6 + 1
            goto L3e
        L28:
            int r3 = r1.positionStart
            if (r3 > r6) goto L3e
            r4 = 2
            if (r2 != r4) goto L38
            int r1 = r1.itemCount
            int r3 = r3 + r1
            if (r6 >= r3) goto L36
            r6 = -1
            return r6
        L36:
            int r6 = r6 - r1
            goto L3e
        L38:
            r3 = 1
            if (r2 != r3) goto L3e
            int r1 = r1.itemCount
            int r6 = r6 + r1
        L3e:
            int r7 = r7 + 1
            goto L6
        L41:
            return r6
    }

    public final boolean hasAnyUpdateTypes(int r2) {
            r1 = this;
            int r0 = r1.mExistingUpdateTypes
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public final boolean hasPendingUpdates() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPendingUpdates
            int r0 = r0.size()
            if (r0 <= 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public androidx.recyclerview.widget.AdapterHelper.UpdateOp obtainUpdateOp(int r2, int r3, int r4, java.lang.Object r5) {
            r1 = this;
            androidx.core.util.Pools$Pool<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mUpdateOpPool
            java.lang.Object r0 = r0.acquire()
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r0
            if (r0 != 0) goto L10
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = new androidx.recyclerview.widget.AdapterHelper$UpdateOp
            r0.<init>(r2, r3, r4, r5)
            goto L18
        L10:
            r0.cmd = r2
            r0.positionStart = r3
            r0.itemCount = r4
            r0.payload = r5
        L18:
            return r0
    }

    public final boolean onItemRangeChanged(int r5, int r6, java.lang.Object r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 >= r0) goto L5
            return r1
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r4.mPendingUpdates
            r3 = 4
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = r4.obtainUpdateOp(r3, r5, r6, r7)
            r2.add(r5)
            int r5 = r4.mExistingUpdateTypes
            r5 = r5 | r3
            r4.mExistingUpdateTypes = r5
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r5 = r4.mPendingUpdates
            int r5 = r5.size()
            if (r5 != r0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public final boolean onItemRangeInserted(int r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 >= r0) goto L5
            return r1
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r4.mPendingUpdates
            r3 = 0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = r4.obtainUpdateOp(r0, r5, r6, r3)
            r2.add(r5)
            int r5 = r4.mExistingUpdateTypes
            r5 = r5 | r0
            r4.mExistingUpdateTypes = r5
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r5 = r4.mPendingUpdates
            int r5 = r5.size()
            if (r5 != r0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    public final boolean onItemRangeMoved(int r5, int r6, int r7) {
            r4 = this;
            r0 = 0
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 1
            if (r7 != r1) goto L22
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r7 = r4.mPendingUpdates
            r2 = 0
            r3 = 8
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r5 = r4.obtainUpdateOp(r3, r5, r6, r2)
            r7.add(r5)
            int r5 = r4.mExistingUpdateTypes
            r5 = r5 | r3
            r4.mExistingUpdateTypes = r5
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r5 = r4.mPendingUpdates
            int r5 = r5.size()
            if (r5 != r1) goto L21
            r0 = 1
        L21:
            return r0
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Moving more than 1 item is not supported yet"
            r5.<init>(r6)
            throw r5
    }

    public final boolean onItemRangeRemoved(int r6, int r7) {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 >= r0) goto L5
            return r1
        L5:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r5.mPendingUpdates
            r3 = 0
            r4 = 2
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = r5.obtainUpdateOp(r4, r6, r7, r3)
            r2.add(r6)
            int r6 = r5.mExistingUpdateTypes
            r6 = r6 | r4
            r5.mExistingUpdateTypes = r6
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r6 = r5.mPendingUpdates
            int r6 = r6.size()
            if (r6 != r0) goto L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    public final void preProcess() {
            r5 = this;
            androidx.recyclerview.widget.OpReorderer r0 = r5.mOpReorderer
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r1 = r5.mPendingUpdates
            r0.reorderOps(r1)
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPendingUpdates
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L3a
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r2 = r5.mPendingUpdates
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r2
            int r3 = r2.cmd
            r4 = 1
            if (r3 == r4) goto L34
            r4 = 2
            if (r3 == r4) goto L30
            r4 = 4
            if (r3 == r4) goto L2c
            r4 = 8
            if (r3 == r4) goto L28
            goto L37
        L28:
            r5.applyMove(r2)
            goto L37
        L2c:
            r5.applyUpdate(r2)
            goto L37
        L30:
            r5.applyRemove(r2)
            goto L37
        L34:
            r5.applyAdd(r2)
        L37:
            int r1 = r1 + 1
            goto Le
        L3a:
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r5.mPendingUpdates
            r0.clear()
            return
    }

    @Override // androidx.recyclerview.widget.OpReorderer.Callback
    public void recycleUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp r2) {
            r1 = this;
            boolean r0 = r1.mDisableRecycler
            if (r0 != 0) goto Lc
            r0 = 0
            r2.payload = r0
            androidx.core.util.Pools$Pool<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mUpdateOpPool
            r0.release(r2)
        Lc:
            return
    }

    public final void recycleUpdateOpsAndClearList(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r4) {
            r3 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            java.lang.Object r2 = r4.get(r1)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r2
            r3.recycleUpdateOp(r2)
            int r1 = r1 + 1
            goto L5
        L13:
            r4.clear()
            return
    }

    public final void reset() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPendingUpdates
            r1.recycleUpdateOpsAndClearList(r0)
            java.util.ArrayList<androidx.recyclerview.widget.AdapterHelper$UpdateOp> r0 = r1.mPostponedList
            r1.recycleUpdateOpsAndClearList(r0)
            r0 = 0
            r1.mExistingUpdateTypes = r0
            return
    }
}
