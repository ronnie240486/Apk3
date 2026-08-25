package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class ArrayLinkedVariables implements androidx.constraintlayout.core.ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    private static float epsilon = 0.001f;
    private int ROW_SIZE;
    private androidx.constraintlayout.core.SolverVariable candidate;
    public int currentSize;
    private int[] mArrayIndices;
    private int[] mArrayNextIndices;
    private float[] mArrayValues;
    public final androidx.constraintlayout.core.Cache mCache;
    private boolean mDidFillOnce;
    private int mHead;
    private int mLast;
    private final androidx.constraintlayout.core.ArrayRow mRow;

    public ArrayLinkedVariables(androidx.constraintlayout.core.ArrayRow r4, androidx.constraintlayout.core.Cache r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.currentSize = r0
            r1 = 8
            r3.ROW_SIZE = r1
            r2 = 0
            r3.candidate = r2
            int[] r2 = new int[r1]
            r3.mArrayIndices = r2
            int[] r2 = new int[r1]
            r3.mArrayNextIndices = r2
            float[] r1 = new float[r1]
            r3.mArrayValues = r1
            r1 = -1
            r3.mHead = r1
            r3.mLast = r1
            r3.mDidFillOnce = r0
            r3.mRow = r4
            r3.mCache = r5
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(androidx.constraintlayout.core.SolverVariable r10, float r11, boolean r12) {
            r9 = this;
            float r0 = androidx.constraintlayout.core.ArrayLinkedVariables.epsilon
            float r1 = -r0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r9.mHead
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != r2) goto L47
            r9.mHead = r1
            float[] r12 = r9.mArrayValues
            r12[r1] = r11
            int[] r11 = r9.mArrayIndices
            int r12 = r10.id
            r11[r1] = r12
            int[] r11 = r9.mArrayNextIndices
            r11[r1] = r2
            int r11 = r10.usageInRowCount
            int r11 = r11 + r3
            r10.usageInRowCount = r11
            androidx.constraintlayout.core.ArrayRow r11 = r9.mRow
            r10.addToRow(r11)
            int r10 = r9.currentSize
            int r10 = r10 + r3
            r9.currentSize = r10
            boolean r10 = r9.mDidFillOnce
            if (r10 != 0) goto L46
            int r10 = r9.mLast
            int r10 = r10 + r3
            r9.mLast = r10
            int[] r11 = r9.mArrayIndices
            int r12 = r11.length
            if (r10 < r12) goto L46
            r9.mDidFillOnce = r3
            int r10 = r11.length
            int r10 = r10 - r3
            r9.mLast = r10
        L46:
            return
        L47:
            r4 = 0
            r5 = -1
        L49:
            if (r0 == r2) goto La4
            int r6 = r9.currentSize
            if (r4 >= r6) goto La4
            int[] r6 = r9.mArrayIndices
            r7 = r6[r0]
            int r8 = r10.id
            if (r7 != r8) goto L98
            float[] r1 = r9.mArrayValues
            r2 = r1[r0]
            float r2 = r2 + r11
            float r11 = androidx.constraintlayout.core.ArrayLinkedVariables.epsilon
            float r4 = -r11
            r6 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L69
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L69
            r2 = 0
        L69:
            r1[r0] = r2
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 != 0) goto L97
            int r11 = r9.mHead
            if (r0 != r11) goto L7a
            int[] r11 = r9.mArrayNextIndices
            r11 = r11[r0]
            r9.mHead = r11
            goto L80
        L7a:
            int[] r11 = r9.mArrayNextIndices
            r1 = r11[r0]
            r11[r5] = r1
        L80:
            if (r12 == 0) goto L87
            androidx.constraintlayout.core.ArrayRow r11 = r9.mRow
            r10.removeFromRow(r11)
        L87:
            boolean r11 = r9.mDidFillOnce
            if (r11 == 0) goto L8d
            r9.mLast = r0
        L8d:
            int r11 = r10.usageInRowCount
            int r11 = r11 - r3
            r10.usageInRowCount = r11
            int r10 = r9.currentSize
            int r10 = r10 - r3
            r9.currentSize = r10
        L97:
            return
        L98:
            r6 = r6[r0]
            if (r6 >= r8) goto L9d
            r5 = r0
        L9d:
            int[] r6 = r9.mArrayNextIndices
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L49
        La4:
            int r12 = r9.mLast
            int r0 = r12 + 1
            boolean r4 = r9.mDidFillOnce
            if (r4 == 0) goto Lb5
            int[] r0 = r9.mArrayIndices
            r4 = r0[r12]
            if (r4 != r2) goto Lb3
            goto Lb6
        Lb3:
            int r12 = r0.length
            goto Lb6
        Lb5:
            r12 = r0
        Lb6:
            int[] r0 = r9.mArrayIndices
            int r4 = r0.length
            if (r12 < r4) goto Lcf
            int r4 = r9.currentSize
            int r0 = r0.length
            if (r4 >= r0) goto Lcf
            r0 = 0
        Lc1:
            int[] r4 = r9.mArrayIndices
            int r6 = r4.length
            if (r0 >= r6) goto Lcf
            r4 = r4[r0]
            if (r4 != r2) goto Lcc
            r12 = r0
            goto Lcf
        Lcc:
            int r0 = r0 + 1
            goto Lc1
        Lcf:
            int[] r0 = r9.mArrayIndices
            int r4 = r0.length
            if (r12 < r4) goto Lfd
            int r12 = r0.length
            int r0 = r9.ROW_SIZE
            int r0 = r0 * 2
            r9.ROW_SIZE = r0
            r9.mDidFillOnce = r1
            int r1 = r12 + (-1)
            r9.mLast = r1
            float[] r1 = r9.mArrayValues
            float[] r0 = java.util.Arrays.copyOf(r1, r0)
            r9.mArrayValues = r0
            int[] r0 = r9.mArrayIndices
            int r1 = r9.ROW_SIZE
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r9.mArrayIndices = r0
            int[] r0 = r9.mArrayNextIndices
            int r1 = r9.ROW_SIZE
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r9.mArrayNextIndices = r0
        Lfd:
            int[] r0 = r9.mArrayIndices
            int r1 = r10.id
            r0[r12] = r1
            float[] r0 = r9.mArrayValues
            r0[r12] = r11
            if (r5 == r2) goto L112
            int[] r11 = r9.mArrayNextIndices
            r0 = r11[r5]
            r11[r12] = r0
            r11[r5] = r12
            goto L11a
        L112:
            int[] r11 = r9.mArrayNextIndices
            int r0 = r9.mHead
            r11[r12] = r0
            r9.mHead = r12
        L11a:
            int r11 = r10.usageInRowCount
            int r11 = r11 + r3
            r10.usageInRowCount = r11
            androidx.constraintlayout.core.ArrayRow r11 = r9.mRow
            r10.addToRow(r11)
            int r10 = r9.currentSize
            int r10 = r10 + r3
            r9.currentSize = r10
            boolean r10 = r9.mDidFillOnce
            if (r10 != 0) goto L132
            int r10 = r9.mLast
            int r10 = r10 + r3
            r9.mLast = r10
        L132:
            int r10 = r9.mLast
            int[] r11 = r9.mArrayIndices
            int r12 = r11.length
            if (r10 < r12) goto L13f
            r9.mDidFillOnce = r3
            int r10 = r11.length
            int r10 = r10 - r3
            r9.mLast = r10
        L13f:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void clear() {
            r5 = this;
            int r0 = r5.mHead
            r1 = 0
            r2 = 0
        L4:
            r3 = -1
            if (r0 == r3) goto L23
            int r4 = r5.currentSize
            if (r2 >= r4) goto L23
            androidx.constraintlayout.core.Cache r3 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r3 = r3.mIndexedVariables
            int[] r4 = r5.mArrayIndices
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L1c
            androidx.constraintlayout.core.ArrayRow r4 = r5.mRow
            r3.removeFromRow(r4)
        L1c:
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L23:
            r5.mHead = r3
            r5.mLast = r3
            r5.mDidFillOnce = r1
            r5.currentSize = r1
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(androidx.constraintlayout.core.SolverVariable r7) {
            r6 = this;
            int r0 = r6.mHead
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            r3 = 0
        L8:
            if (r0 == r1) goto L1f
            int r4 = r6.currentSize
            if (r3 >= r4) goto L1f
            int[] r4 = r6.mArrayIndices
            r4 = r4[r0]
            int r5 = r7.id
            if (r4 != r5) goto L18
            r7 = 1
            return r7
        L18:
            int[] r4 = r6.mArrayNextIndices
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L8
        L1f:
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
            r5 = this;
            int r0 = r5.currentSize
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "{ "
            r1.print(r2)
            r1 = 0
        Lb:
            if (r1 >= r0) goto L39
            androidx.constraintlayout.core.SolverVariable r2 = r5.getVariable(r1)
            if (r2 != 0) goto L14
            goto L36
        L14:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " = "
            r4.append(r2)
            float r2 = r5.getVariableValue(r1)
            r4.append(r2)
            java.lang.String r2 = " "
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.print(r2)
        L36:
            int r1 = r1 + 1
            goto Lb
        L39:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " }"
            r0.println(r1)
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void divideByAmount(float r5) {
            r4 = this;
            int r0 = r4.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r4.currentSize
            if (r1 >= r2) goto L18
            float[] r2 = r4.mArrayValues
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float get(androidx.constraintlayout.core.SolverVariable r5) {
            r4 = this;
            int r0 = r4.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r4.currentSize
            if (r1 >= r2) goto L1e
            int[] r2 = r4.mArrayIndices
            r2 = r2[r0]
            int r3 = r5.id
            if (r2 != r3) goto L17
            float[] r5 = r4.mArrayValues
            r5 = r5[r0]
            return r5
        L17:
            int[] r2 = r4.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r5 = 0
            return r5
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
            r1 = this;
            int r0 = r1.currentSize
            return r0
    }

    public int getHead() {
            r1 = this;
            int r0 = r1.mHead
            return r0
    }

    public final int getId(int r2) {
            r1 = this;
            int[] r0 = r1.mArrayIndices
            r2 = r0[r2]
            return r2
    }

    public final int getNextIndice(int r2) {
            r1 = this;
            int[] r0 = r1.mArrayNextIndices
            r2 = r0[r2]
            return r2
    }

    public final float getValue(int r2) {
            r1 = this;
            float[] r0 = r1.mArrayValues
            r2 = r0[r2]
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public androidx.constraintlayout.core.SolverVariable getVariable(int r4) {
            r3 = this;
            int r0 = r3.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r3.currentSize
            if (r1 >= r2) goto L1e
            if (r1 != r4) goto L17
            androidx.constraintlayout.core.Cache r4 = r3.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int[] r1 = r3.mArrayIndices
            r0 = r1[r0]
            r4 = r4[r0]
            return r4
        L17:
            int[] r2 = r3.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r4 = 0
            return r4
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int r4) {
            r3 = this;
            int r0 = r3.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r3.currentSize
            if (r1 >= r2) goto L18
            if (r1 != r4) goto L11
            float[] r4 = r3.mArrayValues
            r4 = r4[r0]
            return r4
        L11:
            int[] r2 = r3.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            r4 = 0
            return r4
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(androidx.constraintlayout.core.SolverVariable r6) {
            r5 = this;
            int r0 = r5.mHead
            r1 = -1
            if (r0 != r1) goto L6
            return r1
        L6:
            r2 = 0
        L7:
            if (r0 == r1) goto L1d
            int r3 = r5.currentSize
            if (r2 >= r3) goto L1d
            int[] r3 = r5.mArrayIndices
            r3 = r3[r0]
            int r4 = r6.id
            if (r3 != r4) goto L16
            return r0
        L16:
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L7
        L1d:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
            r5 = this;
            int r0 = r5.mHead
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1b
            int r2 = r5.currentSize
            if (r1 >= r2) goto L1b
            float[] r2 = r5.mArrayValues
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.mArrayNextIndices
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1b:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final void put(androidx.constraintlayout.core.SolverVariable r10, float r11) {
            r9 = this;
            r0 = 1
            r1 = 0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto La
            r9.remove(r10, r0)
            return
        La:
            int r1 = r9.mHead
            r2 = 0
            r3 = -1
            if (r1 != r3) goto L44
            r9.mHead = r2
            float[] r1 = r9.mArrayValues
            r1[r2] = r11
            int[] r11 = r9.mArrayIndices
            int r1 = r10.id
            r11[r2] = r1
            int[] r11 = r9.mArrayNextIndices
            r11[r2] = r3
            int r11 = r10.usageInRowCount
            int r11 = r11 + r0
            r10.usageInRowCount = r11
            androidx.constraintlayout.core.ArrayRow r11 = r9.mRow
            r10.addToRow(r11)
            int r10 = r9.currentSize
            int r10 = r10 + r0
            r9.currentSize = r10
            boolean r10 = r9.mDidFillOnce
            if (r10 != 0) goto L43
            int r10 = r9.mLast
            int r10 = r10 + r0
            r9.mLast = r10
            int[] r11 = r9.mArrayIndices
            int r1 = r11.length
            if (r10 < r1) goto L43
            r9.mDidFillOnce = r0
            int r10 = r11.length
            int r10 = r10 - r0
            r9.mLast = r10
        L43:
            return
        L44:
            r4 = 0
            r5 = -1
        L46:
            if (r1 == r3) goto L65
            int r6 = r9.currentSize
            if (r4 >= r6) goto L65
            int[] r6 = r9.mArrayIndices
            r7 = r6[r1]
            int r8 = r10.id
            if (r7 != r8) goto L59
            float[] r10 = r9.mArrayValues
            r10[r1] = r11
            return
        L59:
            r6 = r6[r1]
            if (r6 >= r8) goto L5e
            r5 = r1
        L5e:
            int[] r6 = r9.mArrayNextIndices
            r1 = r6[r1]
            int r4 = r4 + 1
            goto L46
        L65:
            int r1 = r9.mLast
            int r4 = r1 + 1
            boolean r6 = r9.mDidFillOnce
            if (r6 == 0) goto L76
            int[] r4 = r9.mArrayIndices
            r6 = r4[r1]
            if (r6 != r3) goto L74
            goto L77
        L74:
            int r1 = r4.length
            goto L77
        L76:
            r1 = r4
        L77:
            int[] r4 = r9.mArrayIndices
            int r6 = r4.length
            if (r1 < r6) goto L90
            int r6 = r9.currentSize
            int r4 = r4.length
            if (r6 >= r4) goto L90
            r4 = 0
        L82:
            int[] r6 = r9.mArrayIndices
            int r7 = r6.length
            if (r4 >= r7) goto L90
            r6 = r6[r4]
            if (r6 != r3) goto L8d
            r1 = r4
            goto L90
        L8d:
            int r4 = r4 + 1
            goto L82
        L90:
            int[] r4 = r9.mArrayIndices
            int r6 = r4.length
            if (r1 < r6) goto Lbe
            int r1 = r4.length
            int r4 = r9.ROW_SIZE
            int r4 = r4 * 2
            r9.ROW_SIZE = r4
            r9.mDidFillOnce = r2
            int r2 = r1 + (-1)
            r9.mLast = r2
            float[] r2 = r9.mArrayValues
            float[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.mArrayValues = r2
            int[] r2 = r9.mArrayIndices
            int r4 = r9.ROW_SIZE
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.mArrayIndices = r2
            int[] r2 = r9.mArrayNextIndices
            int r4 = r9.ROW_SIZE
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r9.mArrayNextIndices = r2
        Lbe:
            int[] r2 = r9.mArrayIndices
            int r4 = r10.id
            r2[r1] = r4
            float[] r2 = r9.mArrayValues
            r2[r1] = r11
            if (r5 == r3) goto Ld3
            int[] r11 = r9.mArrayNextIndices
            r2 = r11[r5]
            r11[r1] = r2
            r11[r5] = r1
            goto Ldb
        Ld3:
            int[] r11 = r9.mArrayNextIndices
            int r2 = r9.mHead
            r11[r1] = r2
            r9.mHead = r1
        Ldb:
            int r11 = r10.usageInRowCount
            int r11 = r11 + r0
            r10.usageInRowCount = r11
            androidx.constraintlayout.core.ArrayRow r11 = r9.mRow
            r10.addToRow(r11)
            int r10 = r9.currentSize
            int r10 = r10 + r0
            r9.currentSize = r10
            boolean r11 = r9.mDidFillOnce
            if (r11 != 0) goto Lf3
            int r11 = r9.mLast
            int r11 = r11 + r0
            r9.mLast = r11
        Lf3:
            int[] r11 = r9.mArrayIndices
            int r1 = r11.length
            if (r10 < r1) goto Lfa
            r9.mDidFillOnce = r0
        Lfa:
            int r10 = r9.mLast
            int r1 = r11.length
            if (r10 < r1) goto L105
            r9.mDidFillOnce = r0
            int r10 = r11.length
            int r10 = r10 - r0
            r9.mLast = r10
        L105:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public final float remove(androidx.constraintlayout.core.SolverVariable r9, boolean r10) {
            r8 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r8.candidate
            if (r0 != r9) goto L7
            r0 = 0
            r8.candidate = r0
        L7:
            int r0 = r8.mHead
            r1 = 0
            r2 = -1
            if (r0 != r2) goto Le
            return r1
        Le:
            r3 = 0
            r4 = -1
        L10:
            if (r0 == r2) goto L5b
            int r5 = r8.currentSize
            if (r3 >= r5) goto L5b
            int[] r5 = r8.mArrayIndices
            r5 = r5[r0]
            int r6 = r9.id
            if (r5 != r6) goto L51
            int r1 = r8.mHead
            if (r0 != r1) goto L29
            int[] r1 = r8.mArrayNextIndices
            r1 = r1[r0]
            r8.mHead = r1
            goto L2f
        L29:
            int[] r1 = r8.mArrayNextIndices
            r3 = r1[r0]
            r1[r4] = r3
        L2f:
            if (r10 == 0) goto L36
            androidx.constraintlayout.core.ArrayRow r10 = r8.mRow
            r9.removeFromRow(r10)
        L36:
            int r10 = r9.usageInRowCount
            int r10 = r10 + (-1)
            r9.usageInRowCount = r10
            int r9 = r8.currentSize
            int r9 = r9 + (-1)
            r8.currentSize = r9
            int[] r9 = r8.mArrayIndices
            r9[r0] = r2
            boolean r9 = r8.mDidFillOnce
            if (r9 == 0) goto L4c
            r8.mLast = r0
        L4c:
            float[] r9 = r8.mArrayValues
            r9 = r9[r0]
            return r9
        L51:
            int[] r4 = r8.mArrayNextIndices
            r4 = r4[r0]
            int r3 = r3 + 1
            r7 = r4
            r4 = r0
            r0 = r7
            goto L10
        L5b:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
            r1 = this;
            int[] r0 = r1.mArrayIndices
            int r0 = r0.length
            int r0 = r0 * 4
            int r0 = r0 * 3
            int r0 = r0 + 0
            int r0 = r0 + 36
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.mHead
            java.lang.String r1 = ""
            r2 = 0
        L5:
            r3 = -1
            if (r0 == r3) goto L42
            int r3 = r5.currentSize
            if (r2 >= r3) goto L42
            java.lang.String r3 = " -> "
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            float[] r3 = r5.mArrayValues
            r3 = r3[r0]
            r1.append(r3)
            java.lang.String r3 = " : "
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            androidx.constraintlayout.core.Cache r3 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r3 = r3.mIndexedVariables
            int[] r4 = r5.mArrayIndices
            r4 = r4[r0]
            r3 = r3[r4]
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int[] r3 = r5.mArrayNextIndices
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L5
        L42:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(androidx.constraintlayout.core.ArrayRow r6, boolean r7) {
            r5 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r6.variable
            float r0 = r5.get(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r6.variable
            r5.remove(r1, r7)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r6 = r6.variables
            int r1 = r6.getCurrentSize()
            r2 = 0
        L12:
            if (r2 >= r1) goto L24
            androidx.constraintlayout.core.SolverVariable r3 = r6.getVariable(r2)
            float r4 = r6.get(r3)
            float r4 = r4 * r0
            r5.add(r3, r4, r7)
            int r2 = r2 + 1
            goto L12
        L24:
            return r0
    }
}
