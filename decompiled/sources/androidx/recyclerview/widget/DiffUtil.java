package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class DiffUtil {
    private static final java.util.Comparator<androidx.recyclerview.widget.DiffUtil.Diagonal> DIAGONAL_COMPARATOR = null;


    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean areContentsTheSame(int r1, int r2);

        public abstract boolean areItemsTheSame(int r1, int r2);

        @androidx.annotation.Nullable
        public java.lang.Object getChangePayload(int r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        public CenteredArray(int r1) {
                r0 = this;
                r0.<init>()
                int[] r1 = new int[r1]
                r0.mData = r1
                int r1 = r1.length
                int r1 = r1 / 2
                r0.mMid = r1
                return
        }

        public final int[] backingData() {
                r1 = this;
                int[] r0 = r1.mData
                return r0
        }

        public void fill(int r2) {
                r1 = this;
                int[] r0 = r1.mData
                java.util.Arrays.fill(r0, r2)
                return
        }

        public final int get(int r3) {
                r2 = this;
                int[] r0 = r2.mData
                int r1 = r2.mMid
                int r3 = r3 + r1
                r3 = r0[r3]
                return r3
        }

        public final void set(int r3, int r4) {
                r2 = this;
                int[] r0 = r2.mData
                int r1 = r2.mMid
                int r3 = r3 + r1
                r0[r3] = r4
                return
        }
    }

    public static class Diagonal {
        public final int size;
        public final int x;
        public final int y;

        public Diagonal(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.x = r1
                r0.y = r2
                r0.size = r3
                return
        }
    }

    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final androidx.recyclerview.widget.DiffUtil.Callback mCallback;
        private final boolean mDetectMoves;
        private final java.util.List<androidx.recyclerview.widget.DiffUtil.Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        public DiffResult(androidx.recyclerview.widget.DiffUtil.Callback r1, java.util.List<androidx.recyclerview.widget.DiffUtil.Diagonal> r2, int[] r3, int[] r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.mDiagonals = r2
                r0.mOldItemStatuses = r3
                r0.mNewItemStatuses = r4
                r2 = 0
                java.util.Arrays.fill(r3, r2)
                java.util.Arrays.fill(r4, r2)
                r0.mCallback = r1
                int r2 = r1.getOldListSize()
                r0.mOldListSize = r2
                int r1 = r1.getNewListSize()
                r0.mNewListSize = r1
                r0.mDetectMoves = r5
                r0.addEdgeDiagonals()
                r0.findMatchingItems()
                return
        }

        private void addEdgeDiagonals() {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                boolean r0 = r0.isEmpty()
                r1 = 0
                if (r0 == 0) goto Lb
                r0 = 0
                goto L13
            Lb:
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                java.lang.Object r0 = r0.get(r1)
                androidx.recyclerview.widget.DiffUtil$Diagonal r0 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r0
            L13:
                if (r0 == 0) goto L1d
                int r2 = r0.x
                if (r2 != 0) goto L1d
                int r0 = r0.y
                if (r0 == 0) goto L27
            L1d:
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                androidx.recyclerview.widget.DiffUtil$Diagonal r2 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                r2.<init>(r1, r1, r1)
                r0.add(r1, r2)
            L27:
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                androidx.recyclerview.widget.DiffUtil$Diagonal r2 = new androidx.recyclerview.widget.DiffUtil$Diagonal
                int r3 = r5.mOldListSize
                int r4 = r5.mNewListSize
                r2.<init>(r3, r4, r1)
                r0.add(r2)
                return
        }

        private void findMatchingAddition(int r6) {
                r5 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r5.mDiagonals
                int r0 = r0.size()
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L48
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r3 = r5.mDiagonals
                java.lang.Object r3 = r3.get(r1)
                androidx.recyclerview.widget.DiffUtil$Diagonal r3 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r3
            L12:
                int r4 = r3.y
                if (r2 >= r4) goto L42
                int[] r4 = r5.mNewItemStatuses
                r4 = r4[r2]
                if (r4 != 0) goto L3f
                androidx.recyclerview.widget.DiffUtil$Callback r4 = r5.mCallback
                boolean r4 = r4.areItemsTheSame(r6, r2)
                if (r4 == 0) goto L3f
                androidx.recyclerview.widget.DiffUtil$Callback r0 = r5.mCallback
                boolean r0 = r0.areContentsTheSame(r6, r2)
                r1 = 4
                if (r0 == 0) goto L30
                r0 = 8
                goto L31
            L30:
                r0 = 4
            L31:
                int[] r3 = r5.mOldItemStatuses
                int r4 = r2 << 4
                r4 = r4 | r0
                r3[r6] = r4
                int[] r3 = r5.mNewItemStatuses
                int r6 = r6 << r1
                r6 = r6 | r0
                r3[r2] = r6
                return
            L3f:
                int r2 = r2 + 1
                goto L12
            L42:
                int r2 = r3.size
                int r2 = r2 + r4
                int r1 = r1 + 1
                goto L8
            L48:
                return
        }

        private void findMatchingItems() {
                r8 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r8.mDiagonals
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L39
                java.lang.Object r1 = r0.next()
                androidx.recyclerview.widget.DiffUtil$Diagonal r1 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r1
                r2 = 0
            L13:
                int r3 = r1.size
                if (r2 >= r3) goto L6
                int r3 = r1.x
                int r3 = r3 + r2
                int r4 = r1.y
                int r4 = r4 + r2
                androidx.recyclerview.widget.DiffUtil$Callback r5 = r8.mCallback
                boolean r5 = r5.areContentsTheSame(r3, r4)
                if (r5 == 0) goto L27
                r5 = 1
                goto L28
            L27:
                r5 = 2
            L28:
                int[] r6 = r8.mOldItemStatuses
                int r7 = r4 << 4
                r7 = r7 | r5
                r6[r3] = r7
                int[] r6 = r8.mNewItemStatuses
                int r3 = r3 << 4
                r3 = r3 | r5
                r6[r4] = r3
                int r2 = r2 + 1
                goto L13
            L39:
                boolean r0 = r8.mDetectMoves
                if (r0 == 0) goto L40
                r8.findMoveMatches()
            L40:
                return
        }

        private void findMoveMatches() {
                r4 = this;
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = r4.mDiagonals
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r0.next()
                androidx.recyclerview.widget.DiffUtil$Diagonal r2 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r2
            L13:
                int r3 = r2.x
                if (r1 >= r3) goto L23
                int[] r3 = r4.mOldItemStatuses
                r3 = r3[r1]
                if (r3 != 0) goto L20
                r4.findMatchingAddition(r1)
            L20:
                int r1 = r1 + 1
                goto L13
            L23:
                int r1 = r2.size
                int r1 = r1 + r3
                goto L7
            L27:
                return
        }

        @androidx.annotation.Nullable
        private static androidx.recyclerview.widget.DiffUtil.PostponedUpdate getPostponedUpdate(java.util.Collection<androidx.recyclerview.widget.DiffUtil.PostponedUpdate> r2, int r3, boolean r4) {
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1c
                java.lang.Object r0 = r2.next()
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r0 = (androidx.recyclerview.widget.DiffUtil.PostponedUpdate) r0
                int r1 = r0.posInOwnerList
                if (r1 != r3) goto L4
                boolean r1 = r0.removal
                if (r1 != r4) goto L4
                r2.remove()
                goto L1d
            L1c:
                r0 = 0
            L1d:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L39
                java.lang.Object r3 = r2.next()
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r3 = (androidx.recyclerview.widget.DiffUtil.PostponedUpdate) r3
                if (r4 == 0) goto L32
                int r1 = r3.currentPos
                int r1 = r1 + (-1)
                r3.currentPos = r1
                goto L1d
            L32:
                int r1 = r3.currentPos
                int r1 = r1 + 1
                r3.currentPos = r1
                goto L1d
            L39:
                return r0
        }

        public int convertNewPositionToOld(@androidx.annotation.IntRange(from = 0) int r4) {
                r3 = this;
                if (r4 < 0) goto L13
                int r0 = r3.mNewListSize
                if (r4 >= r0) goto L13
                int[] r0 = r3.mNewItemStatuses
                r4 = r0[r4]
                r0 = r4 & 15
                if (r0 != 0) goto L10
                r4 = -1
                return r4
            L10:
                int r4 = r4 >> 4
                return r4
            L13:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Index out of bounds - passed position = "
                java.lang.String r2 = ", new list size = "
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
                int r1 = r3.mNewListSize
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public int convertOldPositionToNew(@androidx.annotation.IntRange(from = 0) int r4) {
                r3 = this;
                if (r4 < 0) goto L13
                int r0 = r3.mOldListSize
                if (r4 >= r0) goto L13
                int[] r0 = r3.mOldItemStatuses
                r4 = r0[r4]
                r0 = r4 & 15
                if (r0 != 0) goto L10
                r4 = -1
                return r4
            L10:
                int r4 = r4 >> 4
                return r4
            L13:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Index out of bounds - passed position = "
                java.lang.String r2 = ", old list size = "
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
                int r1 = r3.mOldListSize
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        public void dispatchUpdatesTo(@androidx.annotation.NonNull androidx.recyclerview.widget.ListUpdateCallback r13) {
                r12 = this;
                boolean r0 = r13 instanceof androidx.recyclerview.widget.BatchingListUpdateCallback
                if (r0 == 0) goto L7
                androidx.recyclerview.widget.BatchingListUpdateCallback r13 = (androidx.recyclerview.widget.BatchingListUpdateCallback) r13
                goto Ld
            L7:
                androidx.recyclerview.widget.BatchingListUpdateCallback r0 = new androidx.recyclerview.widget.BatchingListUpdateCallback
                r0.<init>(r13)
                r13 = r0
            Ld:
                int r0 = r12.mOldListSize
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                int r2 = r12.mOldListSize
                int r3 = r12.mNewListSize
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r4 = r12.mDiagonals
                int r4 = r4.size()
                r5 = 1
                int r4 = r4 - r5
            L20:
                if (r4 < 0) goto Ld3
                java.util.List<androidx.recyclerview.widget.DiffUtil$Diagonal> r6 = r12.mDiagonals
                java.lang.Object r6 = r6.get(r4)
                androidx.recyclerview.widget.DiffUtil$Diagonal r6 = (androidx.recyclerview.widget.DiffUtil.Diagonal) r6
                int r7 = r6.x
                int r8 = r6.size
                int r7 = r7 + r8
                int r9 = r6.y
                int r9 = r9 + r8
            L32:
                r8 = 0
                if (r2 <= r7) goto L6f
                int r2 = r2 + (-1)
                int[] r10 = r12.mOldItemStatuses
                r10 = r10[r2]
                r11 = r10 & 12
                if (r11 == 0) goto L69
                int r11 = r10 >> 4
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r8 = getPostponedUpdate(r1, r11, r8)
                if (r8 == 0) goto L5d
                int r8 = r8.currentPos
                int r8 = r0 - r8
                int r8 = r8 - r5
                r13.onMoved(r2, r8)
                r10 = r10 & 4
                if (r10 == 0) goto L32
                androidx.recyclerview.widget.DiffUtil$Callback r10 = r12.mCallback
                java.lang.Object r10 = r10.getChangePayload(r2, r11)
                r13.onChanged(r8, r5, r10)
                goto L32
            L5d:
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r8 = new androidx.recyclerview.widget.DiffUtil$PostponedUpdate
                int r10 = r0 - r2
                int r10 = r10 - r5
                r8.<init>(r2, r10, r5)
                r1.add(r8)
                goto L32
            L69:
                r13.onRemoved(r2, r5)
                int r0 = r0 + (-1)
                goto L32
            L6f:
                if (r3 <= r9) goto Laa
                int r3 = r3 + (-1)
                int[] r7 = r12.mNewItemStatuses
                r7 = r7[r3]
                r10 = r7 & 12
                if (r10 == 0) goto La4
                int r10 = r7 >> 4
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r11 = getPostponedUpdate(r1, r10, r5)
                if (r11 != 0) goto L8e
                androidx.recyclerview.widget.DiffUtil$PostponedUpdate r7 = new androidx.recyclerview.widget.DiffUtil$PostponedUpdate
                int r10 = r0 - r2
                r7.<init>(r3, r10, r8)
                r1.add(r7)
                goto L6f
            L8e:
                int r11 = r11.currentPos
                int r11 = r0 - r11
                int r11 = r11 - r5
                r13.onMoved(r11, r2)
                r7 = r7 & 4
                if (r7 == 0) goto L6f
                androidx.recyclerview.widget.DiffUtil$Callback r7 = r12.mCallback
                java.lang.Object r7 = r7.getChangePayload(r10, r3)
                r13.onChanged(r2, r5, r7)
                goto L6f
            La4:
                r13.onInserted(r2, r5)
                int r0 = r0 + 1
                goto L6f
            Laa:
                int r2 = r6.x
                int r3 = r6.y
            Lae:
                int r7 = r6.size
                if (r8 >= r7) goto Lcb
                int[] r7 = r12.mOldItemStatuses
                r7 = r7[r2]
                r7 = r7 & 15
                r9 = 2
                if (r7 != r9) goto Lc4
                androidx.recyclerview.widget.DiffUtil$Callback r7 = r12.mCallback
                java.lang.Object r7 = r7.getChangePayload(r2, r3)
                r13.onChanged(r2, r5, r7)
            Lc4:
                int r2 = r2 + 1
                int r3 = r3 + 1
                int r8 = r8 + 1
                goto Lae
            Lcb:
                int r2 = r6.x
                int r3 = r6.y
                int r4 = r4 + (-1)
                goto L20
            Ld3:
                r13.dispatchLastEvent()
                return
        }

        public void dispatchUpdatesTo(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.Adapter r2) {
                r1 = this;
                androidx.recyclerview.widget.AdapterListUpdateCallback r0 = new androidx.recyclerview.widget.AdapterListUpdateCallback
                r0.<init>(r2)
                r1.dispatchUpdatesTo(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class ItemCallback<T> {
        public ItemCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean areContentsTheSame(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull T r2);

        public abstract boolean areItemsTheSame(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull T r2);

        @androidx.annotation.Nullable
        public java.lang.Object getChangePayload(@androidx.annotation.NonNull T r1, @androidx.annotation.NonNull T r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class PostponedUpdate {
        public int currentPos;
        public int posInOwnerList;
        public boolean removal;

        public PostponedUpdate(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.posInOwnerList = r1
                r0.currentPos = r2
                r0.removal = r3
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Range {
        public int newListEnd;
        public int newListStart;
        public int oldListEnd;
        public int oldListStart;

        public Range() {
                r0 = this;
                r0.<init>()
                return
        }

        public Range(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.oldListStart = r1
                r0.oldListEnd = r2
                r0.newListStart = r3
                r0.newListEnd = r4
                return
        }
    }

    public static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        public Snake() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int diagonalSize() {
                r3 = this;
                int r0 = r3.endX
                int r1 = r3.startX
                int r0 = r0 - r1
                int r1 = r3.endY
                int r2 = r3.startY
                int r1 = r1 - r2
                int r0 = java.lang.Math.min(r0, r1)
                return r0
        }
    }

    static {
            androidx.recyclerview.widget.DiffUtil$1 r0 = new androidx.recyclerview.widget.DiffUtil$1
            r0.<init>()
            androidx.recyclerview.widget.DiffUtil.DIAGONAL_COMPARATOR = r0
            return
    }

    private DiffUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    private static androidx.recyclerview.widget.DiffUtil.Snake backward(androidx.recyclerview.widget.DiffUtil.Range r11, androidx.recyclerview.widget.DiffUtil.Callback r12, androidx.recyclerview.widget.DiffUtil.CenteredArray r13, androidx.recyclerview.widget.DiffUtil.CenteredArray r14, int r15) {
            int r0 = r11.oldListEnd
            int r1 = r11.oldListStart
            int r2 = r0 - r1
            int r3 = r11.newListEnd
            int r4 = r11.newListStart
            int r5 = r3 - r4
            int r2 = r2 - r5
            int r2 = r2 % 2
            r5 = 1
            if (r2 != 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            int r0 = r0 - r1
            int r3 = r3 - r4
            int r0 = r0 - r3
            int r1 = -r15
            r3 = r1
        L1a:
            if (r3 > r15) goto L8a
            if (r3 == r1) goto L38
            if (r3 == r15) goto L2f
            int r4 = r3 + 1
            int r4 = r14.get(r4)
            int r6 = r3 + (-1)
            int r6 = r14.get(r6)
            if (r4 >= r6) goto L2f
            goto L38
        L2f:
            int r4 = r3 + (-1)
            int r4 = r14.get(r4)
            int r6 = r4 + (-1)
            goto L3f
        L38:
            int r4 = r3 + 1
            int r4 = r14.get(r4)
            r6 = r4
        L3f:
            int r7 = r11.newListEnd
            int r8 = r11.oldListEnd
            int r8 = r8 - r6
            int r8 = r8 - r3
            int r7 = r7 - r8
            if (r15 == 0) goto L4e
            if (r6 == r4) goto L4b
            goto L4e
        L4b:
            int r8 = r7 + 1
            goto L4f
        L4e:
            r8 = r7
        L4f:
            int r9 = r11.oldListStart
            if (r6 <= r9) goto L66
            int r9 = r11.newListStart
            if (r7 <= r9) goto L66
            int r9 = r6 + (-1)
            int r10 = r7 + (-1)
            boolean r9 = r12.areItemsTheSame(r9, r10)
            if (r9 == 0) goto L66
            int r6 = r6 + (-1)
            int r7 = r7 + (-1)
            goto L4f
        L66:
            r14.set(r3, r6)
            if (r2 == 0) goto L87
            int r9 = r0 - r3
            if (r9 < r1) goto L87
            if (r9 > r15) goto L87
            int r9 = r13.get(r9)
            if (r9 < r6) goto L87
            androidx.recyclerview.widget.DiffUtil$Snake r11 = new androidx.recyclerview.widget.DiffUtil$Snake
            r11.<init>()
            r11.startX = r6
            r11.startY = r7
            r11.endX = r4
            r11.endY = r8
            r11.reverse = r5
            return r11
        L87:
            int r3 = r3 + 2
            goto L1a
        L8a:
            r11 = 0
            return r11
    }

    @androidx.annotation.NonNull
    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(@androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.Callback r1) {
            r0 = 1
            androidx.recyclerview.widget.DiffUtil$DiffResult r1 = calculateDiff(r1, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static androidx.recyclerview.widget.DiffUtil.DiffResult calculateDiff(@androidx.annotation.NonNull androidx.recyclerview.widget.DiffUtil.Callback r14, boolean r15) {
            int r0 = r14.getOldListSize()
            int r1 = r14.getNewListSize()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.recyclerview.widget.DiffUtil$Range r3 = new androidx.recyclerview.widget.DiffUtil$Range
            r5 = 0
            r3.<init>(r5, r0, r5, r1)
            r2.add(r3)
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            int r0 = r0 / 2
            androidx.recyclerview.widget.DiffUtil$CenteredArray r3 = new androidx.recyclerview.widget.DiffUtil$CenteredArray
            int r0 = r0 * 2
            int r0 = r0 + r1
            r3.<init>(r0)
            androidx.recyclerview.widget.DiffUtil$CenteredArray r6 = new androidx.recyclerview.widget.DiffUtil$CenteredArray
            r6.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L32:
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto Ld9
            int r7 = r2.size()
            int r7 = r7 - r1
            java.lang.Object r7 = r2.remove(r7)
            androidx.recyclerview.widget.DiffUtil$Range r7 = (androidx.recyclerview.widget.DiffUtil.Range) r7
            androidx.recyclerview.widget.DiffUtil$Snake r8 = midPoint(r7, r14, r3, r6)
            if (r8 == 0) goto Ld4
            int r9 = r8.diagonalSize()
            if (r9 <= 0) goto L95
            int r9 = r8.endY
            int r10 = r8.startY
            int r9 = r9 - r10
            int r11 = r8.endX
            int r12 = r8.startX
            int r11 = r11 - r12
            if (r9 == r11) goto L5d
            r13 = 1
            goto L5e
        L5d:
            r13 = 0
        L5e:
            if (r13 == 0) goto L8d
            boolean r13 = r8.reverse
            if (r13 == 0) goto L6e
            androidx.recyclerview.widget.DiffUtil$Diagonal r9 = new androidx.recyclerview.widget.DiffUtil$Diagonal
            int r11 = r8.diagonalSize()
            r9.<init>(r12, r10, r11)
            goto L92
        L6e:
            if (r9 <= r11) goto L72
            r9 = 1
            goto L73
        L72:
            r9 = 0
        L73:
            if (r9 == 0) goto L81
            androidx.recyclerview.widget.DiffUtil$Diagonal r9 = new androidx.recyclerview.widget.DiffUtil$Diagonal
            int r10 = r10 + 1
            int r11 = r8.diagonalSize()
            r9.<init>(r12, r10, r11)
            goto L92
        L81:
            androidx.recyclerview.widget.DiffUtil$Diagonal r9 = new androidx.recyclerview.widget.DiffUtil$Diagonal
            int r12 = r12 + 1
            int r11 = r8.diagonalSize()
            r9.<init>(r12, r10, r11)
            goto L92
        L8d:
            androidx.recyclerview.widget.DiffUtil$Diagonal r9 = new androidx.recyclerview.widget.DiffUtil$Diagonal
            r9.<init>(r12, r10, r11)
        L92:
            r4.add(r9)
        L95:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto La1
            androidx.recyclerview.widget.DiffUtil$Range r9 = new androidx.recyclerview.widget.DiffUtil$Range
            r9.<init>()
            goto Lac
        La1:
            int r9 = r0.size()
            int r9 = r9 - r1
            java.lang.Object r9 = r0.remove(r9)
            androidx.recyclerview.widget.DiffUtil$Range r9 = (androidx.recyclerview.widget.DiffUtil.Range) r9
        Lac:
            int r10 = r7.oldListStart
            r9.oldListStart = r10
            int r10 = r7.newListStart
            r9.newListStart = r10
            int r10 = r8.startX
            r9.oldListEnd = r10
            int r10 = r8.startY
            r9.newListEnd = r10
            r2.add(r9)
            int r9 = r7.oldListEnd
            r7.oldListEnd = r9
            int r9 = r7.newListEnd
            r7.newListEnd = r9
            int r9 = r8.endX
            r7.oldListStart = r9
            int r8 = r8.endY
            r7.newListStart = r8
            r2.add(r7)
            goto L32
        Ld4:
            r0.add(r7)
            goto L32
        Ld9:
            java.util.Comparator<androidx.recyclerview.widget.DiffUtil$Diagonal> r0 = androidx.recyclerview.widget.DiffUtil.DIAGONAL_COMPARATOR
            java.util.Collections.sort(r4, r0)
            androidx.recyclerview.widget.DiffUtil$DiffResult r0 = new androidx.recyclerview.widget.DiffUtil$DiffResult
            int[] r5 = r3.backingData()
            int[] r6 = r6.backingData()
            r2 = r0
            r3 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
    }

    @androidx.annotation.Nullable
    private static androidx.recyclerview.widget.DiffUtil.Snake forward(androidx.recyclerview.widget.DiffUtil.Range r11, androidx.recyclerview.widget.DiffUtil.Callback r12, androidx.recyclerview.widget.DiffUtil.CenteredArray r13, androidx.recyclerview.widget.DiffUtil.CenteredArray r14, int r15) {
            int r0 = r11.oldListEnd
            int r1 = r11.oldListStart
            int r0 = r0 - r1
            int r1 = r11.newListEnd
            int r2 = r11.newListStart
            int r1 = r1 - r2
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            int r0 = r11.oldListEnd
            int r3 = r11.oldListStart
            int r0 = r0 - r3
            int r3 = r11.newListEnd
            int r4 = r11.newListStart
            int r3 = r3 - r4
            int r0 = r0 - r3
            int r3 = -r15
            r4 = r3
        L24:
            if (r4 > r15) goto L95
            if (r4 == r3) goto L42
            if (r4 == r15) goto L39
            int r5 = r4 + 1
            int r5 = r13.get(r5)
            int r6 = r4 + (-1)
            int r6 = r13.get(r6)
            if (r5 <= r6) goto L39
            goto L42
        L39:
            int r5 = r4 + (-1)
            int r5 = r13.get(r5)
            int r6 = r5 + 1
            goto L49
        L42:
            int r5 = r4 + 1
            int r5 = r13.get(r5)
            r6 = r5
        L49:
            int r7 = r11.newListStart
            int r8 = r11.oldListStart
            int r8 = r6 - r8
            int r8 = r8 + r7
            int r8 = r8 - r4
            if (r15 == 0) goto L59
            if (r6 == r5) goto L56
            goto L59
        L56:
            int r7 = r8 + (-1)
            goto L5a
        L59:
            r7 = r8
        L5a:
            int r9 = r11.oldListEnd
            if (r6 >= r9) goto L6d
            int r9 = r11.newListEnd
            if (r8 >= r9) goto L6d
            boolean r9 = r12.areItemsTheSame(r6, r8)
            if (r9 == 0) goto L6d
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto L5a
        L6d:
            r13.set(r4, r6)
            if (r2 == 0) goto L92
            int r9 = r0 - r4
            int r10 = r3 + 1
            if (r9 < r10) goto L92
            int r10 = r15 + (-1)
            if (r9 > r10) goto L92
            int r9 = r14.get(r9)
            if (r9 > r6) goto L92
            androidx.recyclerview.widget.DiffUtil$Snake r11 = new androidx.recyclerview.widget.DiffUtil$Snake
            r11.<init>()
            r11.startX = r5
            r11.startY = r7
            r11.endX = r6
            r11.endY = r8
            r11.reverse = r1
            return r11
        L92:
            int r4 = r4 + 2
            goto L24
        L95:
            r11 = 0
            return r11
    }

    @androidx.annotation.Nullable
    private static androidx.recyclerview.widget.DiffUtil.Snake midPoint(androidx.recyclerview.widget.DiffUtil.Range r7, androidx.recyclerview.widget.DiffUtil.Callback r8, androidx.recyclerview.widget.DiffUtil.CenteredArray r9, androidx.recyclerview.widget.DiffUtil.CenteredArray r10) {
            int r0 = r7.oldListEnd
            int r1 = r7.oldListStart
            int r2 = r0 - r1
            r3 = 0
            r4 = 1
            if (r2 < r4) goto L35
            int r2 = r7.newListEnd
            int r5 = r7.newListStart
            int r6 = r2 - r5
            if (r6 >= r4) goto L13
            goto L35
        L13:
            int r0 = r0 - r1
            int r2 = r2 - r5
            int r2 = r2 + r0
            int r2 = r2 + r4
            int r2 = r2 / 2
            r9.set(r4, r1)
            int r0 = r7.oldListEnd
            r10.set(r4, r0)
            r0 = 0
        L22:
            if (r0 >= r2) goto L35
            androidx.recyclerview.widget.DiffUtil$Snake r1 = forward(r7, r8, r9, r10, r0)
            if (r1 == 0) goto L2b
            return r1
        L2b:
            androidx.recyclerview.widget.DiffUtil$Snake r1 = backward(r7, r8, r9, r10, r0)
            if (r1 == 0) goto L32
            return r1
        L32:
            int r0 = r0 + 1
            goto L22
        L35:
            return r3
    }
}
