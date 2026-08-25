package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class OpReorderer {
    public final androidx.recyclerview.widget.OpReorderer.Callback mCallback;

    public interface Callback {
        androidx.recyclerview.widget.AdapterHelper.UpdateOp obtainUpdateOp(int r1, int r2, int r3, java.lang.Object r4);

        void recycleUpdateOp(androidx.recyclerview.widget.AdapterHelper.UpdateOp r1);
    }

    public OpReorderer(androidx.recyclerview.widget.OpReorderer.Callback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            return
    }

    private int getLastMoveOutOfOrder(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L7:
            if (r0 < 0) goto L1c
            java.lang.Object r3 = r6.get(r0)
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r3 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r3
            int r3 = r3.cmd
            r4 = 8
            if (r3 != r4) goto L18
            if (r2 == 0) goto L19
            return r0
        L18:
            r2 = 1
        L19:
            int r0 = r0 + (-1)
            goto L7
        L1c:
            r6 = -1
            return r6
    }

    private void swapMoveAdd(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r5, int r6, androidx.recyclerview.widget.AdapterHelper.UpdateOp r7, int r8, androidx.recyclerview.widget.AdapterHelper.UpdateOp r9) {
            r4 = this;
            int r0 = r7.itemCount
            int r1 = r9.positionStart
            if (r0 >= r1) goto L8
            r2 = -1
            goto L9
        L8:
            r2 = 0
        L9:
            int r3 = r7.positionStart
            if (r3 >= r1) goto Lf
            int r2 = r2 + 1
        Lf:
            if (r1 > r3) goto L16
            int r1 = r9.itemCount
            int r3 = r3 + r1
            r7.positionStart = r3
        L16:
            int r1 = r9.positionStart
            if (r1 > r0) goto L1f
            int r3 = r9.itemCount
            int r0 = r0 + r3
            r7.itemCount = r0
        L1f:
            int r1 = r1 + r2
            r9.positionStart = r1
            r5.set(r6, r9)
            r5.set(r8, r7)
            return
    }

    private void swapMoveOp(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r11, int r12, int r13) {
            r10 = this;
            java.lang.Object r0 = r11.get(r12)
            r4 = r0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r4 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r4
            java.lang.Object r0 = r11.get(r13)
            r6 = r0
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r6 = (androidx.recyclerview.widget.AdapterHelper.UpdateOp) r6
            int r0 = r6.cmd
            r1 = 1
            if (r0 == r1) goto L15f
            r2 = 0
            r3 = 2
            if (r0 == r3) goto L77
            r3 = 4
            if (r0 == r3) goto L1c
            goto L166
        L1c:
            int r0 = r4.itemCount
            int r5 = r6.positionStart
            if (r0 >= r5) goto L26
            int r5 = r5 - r1
            r6.positionStart = r5
            goto L39
        L26:
            int r7 = r6.itemCount
            int r5 = r5 + r7
            if (r0 >= r5) goto L39
            int r7 = r7 - r1
            r6.itemCount = r7
            androidx.recyclerview.widget.OpReorderer$Callback r0 = r10.mCallback
            int r5 = r4.positionStart
            java.lang.Object r7 = r6.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r0 = r0.obtainUpdateOp(r3, r5, r1, r7)
            goto L3a
        L39:
            r0 = r2
        L3a:
            int r5 = r4.positionStart
            int r7 = r6.positionStart
            if (r5 > r7) goto L44
            int r7 = r7 + r1
            r6.positionStart = r7
            goto L58
        L44:
            int r8 = r6.itemCount
            int r7 = r7 + r8
            if (r5 >= r7) goto L58
            int r7 = r7 - r5
            androidx.recyclerview.widget.OpReorderer$Callback r2 = r10.mCallback
            int r5 = r5 + r1
            java.lang.Object r1 = r6.payload
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = r2.obtainUpdateOp(r3, r5, r7, r1)
            int r1 = r6.itemCount
            int r1 = r1 - r7
            r6.itemCount = r1
        L58:
            r11.set(r13, r4)
            int r13 = r6.itemCount
            if (r13 <= 0) goto L63
            r11.set(r12, r6)
            goto L6b
        L63:
            r11.remove(r12)
            androidx.recyclerview.widget.OpReorderer$Callback r13 = r10.mCallback
            r13.recycleUpdateOp(r6)
        L6b:
            if (r0 == 0) goto L70
            r11.add(r12, r0)
        L70:
            if (r2 == 0) goto L166
            r11.add(r12, r2)
            goto L166
        L77:
            int r0 = r4.positionStart
            int r5 = r4.itemCount
            r7 = 0
            if (r0 >= r5) goto L8b
            int r8 = r6.positionStart
            if (r8 != r0) goto L89
            int r8 = r6.itemCount
            int r0 = r5 - r0
            if (r8 != r0) goto L89
            goto L97
        L89:
            r0 = 0
            goto L9b
        L8b:
            int r8 = r6.positionStart
            int r9 = r5 + 1
            if (r8 != r9) goto L9a
            int r8 = r6.itemCount
            int r0 = r0 - r5
            if (r8 != r0) goto L9a
            r7 = 1
        L97:
            r0 = r7
            r7 = 1
            goto L9b
        L9a:
            r0 = 1
        L9b:
            int r8 = r6.positionStart
            if (r5 >= r8) goto La3
            int r8 = r8 - r1
            r6.positionStart = r8
            goto Lbd
        La3:
            int r9 = r6.itemCount
            int r8 = r8 + r9
            if (r5 >= r8) goto Lbd
            int r9 = r9 - r1
            r6.itemCount = r9
            r4.cmd = r3
            r4.itemCount = r1
            int r12 = r6.itemCount
            if (r12 != 0) goto L166
            r11.remove(r13)
            androidx.recyclerview.widget.OpReorderer$Callback r11 = r10.mCallback
            r11.recycleUpdateOp(r6)
            goto L166
        Lbd:
            int r5 = r4.positionStart
            int r8 = r6.positionStart
            if (r5 > r8) goto Lc7
            int r8 = r8 + r1
            r6.positionStart = r8
            goto Ldb
        Lc7:
            int r9 = r6.itemCount
            int r8 = r8 + r9
            if (r5 >= r8) goto Ldb
            int r8 = r8 - r5
            androidx.recyclerview.widget.OpReorderer$Callback r9 = r10.mCallback
            int r5 = r5 + r1
            androidx.recyclerview.widget.AdapterHelper$UpdateOp r2 = r9.obtainUpdateOp(r3, r5, r8, r2)
            int r1 = r4.positionStart
            int r3 = r6.positionStart
            int r1 = r1 - r3
            r6.itemCount = r1
        Ldb:
            if (r7 == 0) goto Lea
            r11.set(r12, r6)
            r11.remove(r13)
            androidx.recyclerview.widget.OpReorderer$Callback r11 = r10.mCallback
            r11.recycleUpdateOp(r4)
            goto L166
        Lea:
            if (r0 == 0) goto L11b
            if (r2 == 0) goto L104
            int r0 = r4.positionStart
            int r1 = r2.positionStart
            if (r0 <= r1) goto Lf9
            int r1 = r2.itemCount
            int r0 = r0 - r1
            r4.positionStart = r0
        Lf9:
            int r0 = r4.itemCount
            int r1 = r2.positionStart
            if (r0 <= r1) goto L104
            int r1 = r2.itemCount
            int r0 = r0 - r1
            r4.itemCount = r0
        L104:
            int r0 = r4.positionStart
            int r1 = r6.positionStart
            if (r0 <= r1) goto L10f
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r4.positionStart = r0
        L10f:
            int r0 = r4.itemCount
            int r1 = r6.positionStart
            if (r0 <= r1) goto L149
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r4.itemCount = r0
            goto L149
        L11b:
            if (r2 == 0) goto L133
            int r0 = r4.positionStart
            int r1 = r2.positionStart
            if (r0 < r1) goto L128
            int r1 = r2.itemCount
            int r0 = r0 - r1
            r4.positionStart = r0
        L128:
            int r0 = r4.itemCount
            int r1 = r2.positionStart
            if (r0 < r1) goto L133
            int r1 = r2.itemCount
            int r0 = r0 - r1
            r4.itemCount = r0
        L133:
            int r0 = r4.positionStart
            int r1 = r6.positionStart
            if (r0 < r1) goto L13e
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r4.positionStart = r0
        L13e:
            int r0 = r4.itemCount
            int r1 = r6.positionStart
            if (r0 < r1) goto L149
            int r1 = r6.itemCount
            int r0 = r0 - r1
            r4.itemCount = r0
        L149:
            r11.set(r12, r6)
            int r0 = r4.positionStart
            int r1 = r4.itemCount
            if (r0 == r1) goto L156
            r11.set(r13, r4)
            goto L159
        L156:
            r11.remove(r13)
        L159:
            if (r2 == 0) goto L166
            r11.add(r12, r2)
            goto L166
        L15f:
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r13
            r1.swapMoveAdd(r2, r3, r4, r5, r6)
        L166:
            return
    }

    public final void reorderOps(java.util.List<androidx.recyclerview.widget.AdapterHelper.UpdateOp> r3) {
            r2 = this;
        L0:
            int r0 = r2.getLastMoveOutOfOrder(r3)
            r1 = -1
            if (r0 == r1) goto Ld
            int r1 = r0 + 1
            r2.swapMoveOp(r3, r0, r1)
            goto L0
        Ld:
            return
    }
}
