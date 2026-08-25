package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariableValues implements androidx.constraintlayout.core.ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float epsilon = 0.001f;
    private int HASH_SIZE;
    private final int NONE;
    private int SIZE;
    public int head;
    public int[] keys;
    public final androidx.constraintlayout.core.Cache mCache;
    public int mCount;
    private final androidx.constraintlayout.core.ArrayRow mRow;
    public int[] next;
    public int[] nextKeys;
    public int[] previous;
    public float[] values;
    public int[] variables;

    public SolverVariableValues(androidx.constraintlayout.core.ArrayRow r4, androidx.constraintlayout.core.Cache r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.NONE = r0
            r1 = 16
            r3.SIZE = r1
            r3.HASH_SIZE = r1
            int[] r2 = new int[r1]
            r3.keys = r2
            int[] r2 = new int[r1]
            r3.nextKeys = r2
            int[] r2 = new int[r1]
            r3.variables = r2
            float[] r2 = new float[r1]
            r3.values = r2
            int[] r2 = new int[r1]
            r3.previous = r2
            int[] r1 = new int[r1]
            r3.next = r1
            r1 = 0
            r3.mCount = r1
            r3.head = r0
            r3.mRow = r4
            r3.mCache = r5
            r3.clear()
            return
    }

    private void addToHashMap(androidx.constraintlayout.core.SolverVariable r4, int r5) {
            r3 = this;
            int r4 = r4.id
            int r0 = r3.HASH_SIZE
            int r4 = r4 % r0
            int[] r0 = r3.keys
            r1 = r0[r4]
            r2 = -1
            if (r1 != r2) goto Lf
            r0[r4] = r5
            goto L1a
        Lf:
            int[] r4 = r3.nextKeys
            r0 = r4[r1]
            if (r0 == r2) goto L18
            r1 = r4[r1]
            goto Lf
        L18:
            r4[r1] = r5
        L1a:
            int[] r4 = r3.nextKeys
            r4[r5] = r2
            return
    }

    private void addVariable(int r3, androidx.constraintlayout.core.SolverVariable r4, float r5) {
            r2 = this;
            int[] r0 = r2.variables
            int r1 = r4.id
            r0[r3] = r1
            float[] r0 = r2.values
            r0[r3] = r5
            int[] r5 = r2.previous
            r0 = -1
            r5[r3] = r0
            int[] r5 = r2.next
            r5[r3] = r0
            androidx.constraintlayout.core.ArrayRow r3 = r2.mRow
            r4.addToRow(r3)
            int r3 = r4.usageInRowCount
            int r3 = r3 + 1
            r4.usageInRowCount = r3
            int r3 = r2.mCount
            int r3 = r3 + 1
            r2.mCount = r3
            return
    }

    private void displayHash() {
            r7 = this;
            r0 = 0
        L1:
            int r1 = r7.HASH_SIZE
            if (r0 >= r1) goto L54
            int[] r1 = r7.keys
            r1 = r1[r0]
            r2 = -1
            if (r1 == r2) goto L51
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r7.hashCode()
            r1.append(r3)
            java.lang.String r3 = " hash ["
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = "] => "
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            int[] r3 = r7.keys
            r3 = r3[r0]
            r4 = 0
        L2e:
            if (r4 != 0) goto L4c
            java.lang.String r5 = " "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r1, r5)
            int[] r5 = r7.variables
            r5 = r5[r3]
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            int[] r5 = r7.nextKeys
            r6 = r5[r3]
            if (r6 == r2) goto L4a
            r3 = r5[r3]
            goto L2e
        L4a:
            r4 = 1
            goto L2e
        L4c:
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r1)
        L51:
            int r0 = r0 + 1
            goto L1
        L54:
            return
    }

    private int findEmptySlot() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.SIZE
            r2 = -1
            if (r0 >= r1) goto L10
            int[] r1 = r3.variables
            r1 = r1[r0]
            if (r1 != r2) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L1
        L10:
            return r2
    }

    private void increaseSize() {
            r4 = this;
            int r0 = r4.SIZE
            int r0 = r0 * 2
            int[] r1 = r4.variables
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.variables = r1
            float[] r1 = r4.values
            float[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.values = r1
            int[] r1 = r4.previous
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.previous = r1
            int[] r1 = r4.next
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.next = r1
            int[] r1 = r4.nextKeys
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.nextKeys = r1
            int r1 = r4.SIZE
        L2e:
            if (r1 >= r0) goto L3c
            int[] r2 = r4.variables
            r3 = -1
            r2[r1] = r3
            int[] r2 = r4.nextKeys
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L3c:
            r4.SIZE = r0
            return
    }

    private void insertVariable(int r4, androidx.constraintlayout.core.SolverVariable r5, float r6) {
            r3 = this;
            int r0 = r3.findEmptySlot()
            r3.addVariable(r0, r5, r6)
            r6 = -1
            if (r4 == r6) goto L17
            int[] r1 = r3.previous
            r1[r0] = r4
            int[] r1 = r3.next
            r2 = r1[r4]
            r1[r0] = r2
            r1[r4] = r0
            goto L2c
        L17:
            int[] r4 = r3.previous
            r4[r0] = r6
            int r4 = r3.mCount
            if (r4 <= 0) goto L28
            int[] r4 = r3.next
            int r1 = r3.head
            r4[r0] = r1
            r3.head = r0
            goto L2c
        L28:
            int[] r4 = r3.next
            r4[r0] = r6
        L2c:
            int[] r4 = r3.next
            r1 = r4[r0]
            if (r1 == r6) goto L38
            int[] r6 = r3.previous
            r4 = r4[r0]
            r6[r4] = r0
        L38:
            r3.addToHashMap(r5, r0)
            return
    }

    private void removeFromHashMap(androidx.constraintlayout.core.SolverVariable r6) {
            r5 = this;
            int r6 = r6.id
            int r0 = r5.HASH_SIZE
            int r0 = r6 % r0
            int[] r1 = r5.keys
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto Le
            return
        Le:
            int[] r4 = r5.variables
            r4 = r4[r2]
            if (r4 != r6) goto L1d
            int[] r6 = r5.nextKeys
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L3e
        L1d:
            int[] r0 = r5.nextKeys
            r1 = r0[r2]
            if (r1 == r3) goto L2e
            int[] r1 = r5.variables
            r4 = r0[r2]
            r1 = r1[r4]
            if (r1 == r6) goto L2e
            r2 = r0[r2]
            goto L1d
        L2e:
            r1 = r0[r2]
            if (r1 == r3) goto L3e
            int[] r4 = r5.variables
            r4 = r4[r1]
            if (r4 != r6) goto L3e
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L3e:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void add(androidx.constraintlayout.core.SolverVariable r5, float r6, boolean r7) {
            r4 = this;
            float r0 = androidx.constraintlayout.core.SolverVariableValues.epsilon
            float r1 = -r0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r4.indexOf(r5)
            r1 = -1
            if (r0 != r1) goto L17
            r4.put(r5, r6)
            goto L33
        L17:
            float[] r1 = r4.values
            r2 = r1[r0]
            float r2 = r2 + r6
            r1[r0] = r2
            r6 = r1[r0]
            float r2 = androidx.constraintlayout.core.SolverVariableValues.epsilon
            float r3 = -r2
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L33
            r6 = r1[r0]
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L33
            r6 = 0
            r1[r0] = r6
            r4.remove(r5, r7)
        L33:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void clear() {
            r5 = this;
            int r0 = r5.mCount
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r0) goto L14
            androidx.constraintlayout.core.SolverVariable r3 = r5.getVariable(r2)
            if (r3 == 0) goto L11
            androidx.constraintlayout.core.ArrayRow r4 = r5.mRow
            r3.removeFromRow(r4)
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            r0 = 0
        L15:
            int r2 = r5.SIZE
            r3 = -1
            if (r0 >= r2) goto L25
            int[] r2 = r5.variables
            r2[r0] = r3
            int[] r2 = r5.nextKeys
            r2[r0] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            r0 = 0
        L26:
            int r2 = r5.HASH_SIZE
            if (r0 >= r2) goto L31
            int[] r2 = r5.keys
            r2[r0] = r3
            int r0 = r0 + 1
            goto L26
        L31:
            r5.mCount = r1
            r5.head = r3
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public boolean contains(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void display() {
            r5 = this;
            int r0 = r5.mCount
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
    public void divideByAmount(float r6) {
            r5 = this;
            int r0 = r5.mCount
            int r1 = r5.head
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            float[] r3 = r5.values
            r4 = r3[r1]
            float r4 = r4 / r6
            r3[r1] = r4
            int[] r3 = r5.next
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float get(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            float[] r0 = r1.values
            r2 = r0[r2]
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int getCurrentSize() {
            r1 = this;
            int r0 = r1.mCount
            return r0
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public androidx.constraintlayout.core.SolverVariable getVariable(int r7) {
            r6 = this;
            int r0 = r6.mCount
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r6.head
            r3 = 0
        L9:
            if (r3 >= r0) goto L25
            r4 = -1
            if (r3 != r7) goto L1b
            if (r2 == r4) goto L1b
            androidx.constraintlayout.core.Cache r7 = r6.mCache
            androidx.constraintlayout.core.SolverVariable[] r7 = r7.mIndexedVariables
            int[] r0 = r6.variables
            r0 = r0[r2]
            r7 = r7[r0]
            return r7
        L1b:
            int[] r5 = r6.next
            r2 = r5[r2]
            if (r2 != r4) goto L22
            goto L25
        L22:
            int r3 = r3 + 1
            goto L9
        L25:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float getVariableValue(int r5) {
            r4 = this;
            int r0 = r4.mCount
            int r1 = r4.head
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            if (r2 != r5) goto Le
            float[] r5 = r4.values
            r5 = r5[r1]
            return r5
        Le:
            int[] r3 = r4.next
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int indexOf(androidx.constraintlayout.core.SolverVariable r6) {
            r5 = this;
            int r0 = r5.mCount
            r1 = -1
            if (r0 == 0) goto L3d
            if (r6 != 0) goto L8
            goto L3d
        L8:
            int r6 = r6.id
            int r0 = r5.HASH_SIZE
            int r0 = r6 % r0
            int[] r2 = r5.keys
            r0 = r2[r0]
            if (r0 != r1) goto L15
            return r1
        L15:
            int[] r2 = r5.variables
            r2 = r2[r0]
            if (r2 != r6) goto L1c
            return r0
        L1c:
            int[] r2 = r5.nextKeys
            r3 = r2[r0]
            if (r3 == r1) goto L2d
            int[] r3 = r5.variables
            r4 = r2[r0]
            r3 = r3[r4]
            if (r3 == r6) goto L2d
            r0 = r2[r0]
            goto L1c
        L2d:
            r3 = r2[r0]
            if (r3 != r1) goto L32
            return r1
        L32:
            int[] r3 = r5.variables
            r4 = r2[r0]
            r3 = r3[r4]
            if (r3 != r6) goto L3d
            r6 = r2[r0]
            return r6
        L3d:
            return r1
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void invert() {
            r6 = this;
            int r0 = r6.mCount
            int r1 = r6.head
            r2 = 0
        L5:
            if (r2 >= r0) goto L1c
            float[] r3 = r6.values
            r4 = r3[r1]
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            r3[r1] = r4
            int[] r3 = r6.next
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L19
            goto L1c
        L19:
            int r2 = r2 + 1
            goto L5
        L1c:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public void put(androidx.constraintlayout.core.SolverVariable r9, float r10) {
            r8 = this;
            float r0 = androidx.constraintlayout.core.SolverVariableValues.epsilon
            float r1 = -r0
            r2 = 1
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L10
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L10
            r8.remove(r9, r2)
            return
        L10:
            int r0 = r8.mCount
            r1 = 0
            if (r0 != 0) goto L1e
            r8.addVariable(r1, r9, r10)
            r8.addToHashMap(r9, r1)
            r8.head = r1
            goto L5a
        L1e:
            int r0 = r8.indexOf(r9)
            r3 = -1
            if (r0 == r3) goto L2a
            float[] r9 = r8.values
            r9[r0] = r10
            goto L5a
        L2a:
            int r0 = r8.mCount
            int r0 = r0 + r2
            int r2 = r8.SIZE
            if (r0 < r2) goto L34
            r8.increaseSize()
        L34:
            int r0 = r8.mCount
            int r2 = r8.head
            r4 = -1
        L39:
            if (r1 >= r0) goto L57
            int[] r5 = r8.variables
            r6 = r5[r2]
            int r7 = r9.id
            if (r6 != r7) goto L48
            float[] r9 = r8.values
            r9[r2] = r10
            return
        L48:
            r5 = r5[r2]
            if (r5 >= r7) goto L4d
            r4 = r2
        L4d:
            int[] r5 = r8.next
            r2 = r5[r2]
            if (r2 != r3) goto L54
            goto L57
        L54:
            int r1 = r1 + 1
            goto L39
        L57:
            r8.insertVariable(r4, r9, r10)
        L5a:
            return
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float remove(androidx.constraintlayout.core.SolverVariable r8, boolean r9) {
            r7 = this;
            int r0 = r7.indexOf(r8)
            r1 = -1
            if (r0 != r1) goto L9
            r8 = 0
            return r8
        L9:
            r7.removeFromHashMap(r8)
            float[] r2 = r7.values
            r2 = r2[r0]
            int r3 = r7.head
            if (r3 != r0) goto L1a
            int[] r3 = r7.next
            r3 = r3[r0]
            r7.head = r3
        L1a:
            int[] r3 = r7.variables
            r3[r0] = r1
            int[] r3 = r7.previous
            r4 = r3[r0]
            if (r4 == r1) goto L2c
            int[] r4 = r7.next
            r5 = r3[r0]
            r6 = r4[r0]
            r4[r5] = r6
        L2c:
            int[] r4 = r7.next
            r5 = r4[r0]
            if (r5 == r1) goto L38
            r1 = r4[r0]
            r0 = r3[r0]
            r3[r1] = r0
        L38:
            int r0 = r7.mCount
            int r0 = r0 + (-1)
            r7.mCount = r0
            int r0 = r8.usageInRowCount
            int r0 = r0 + (-1)
            r8.usageInRowCount = r0
            if (r9 == 0) goto L4b
            androidx.constraintlayout.core.ArrayRow r9 = r7.mRow
            r8.removeFromRow(r9)
        L4b:
            return r2
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public int sizeInBytes() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.hashCode()
            r0.append(r1)
            java.lang.String r1 = " { "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r9.mCount
            r2 = 0
        L18:
            if (r2 >= r1) goto La7
            androidx.constraintlayout.core.SolverVariable r3 = r9.getVariable(r2)
            if (r3 != 0) goto L22
            goto La3
        L22:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " = "
            r4.append(r0)
            float r0 = r9.getVariableValue(r2)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r3 = r9.indexOf(r3)
            java.lang.String r4 = "[p: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            int[] r4 = r9.previous
            r4 = r4[r3]
            java.lang.String r5 = "none"
            r6 = -1
            if (r4 == r6) goto L6f
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int[] r7 = r9.variables
            int[] r8 = r9.previous
            r8 = r8[r3]
            r7 = r7[r8]
            r4 = r4[r7]
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L73
        L6f:
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
        L73:
            java.lang.String r4 = ", n: "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4)
            int[] r4 = r9.next
            r4 = r4[r3]
            if (r4 == r6) goto L99
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int[] r5 = r9.variables
            int[] r6 = r9.next
            r3 = r6[r3]
            r3 = r5[r3]
            r3 = r4[r3]
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            goto L9d
        L99:
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5)
        L9d:
            java.lang.String r3 = "]"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
        La3:
            int r2 = r2 + 1
            goto L18
        La7:
            java.lang.String r1 = " }"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.ArrayRow.ArrayRowVariables
    public float use(androidx.constraintlayout.core.ArrayRow r8, boolean r9) {
            r7 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            float r0 = r7.get(r0)
            androidx.constraintlayout.core.SolverVariable r1 = r8.variable
            r7.remove(r1, r9)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r8 = r8.variables
            androidx.constraintlayout.core.SolverVariableValues r8 = (androidx.constraintlayout.core.SolverVariableValues) r8
            int r1 = r8.getCurrentSize()
            r2 = 0
            r3 = 0
        L15:
            if (r2 >= r1) goto L34
            int[] r4 = r8.variables
            r5 = r4[r3]
            r6 = -1
            if (r5 == r6) goto L31
            float[] r5 = r8.values
            r5 = r5[r3]
            androidx.constraintlayout.core.Cache r6 = r7.mCache
            androidx.constraintlayout.core.SolverVariable[] r6 = r6.mIndexedVariables
            r4 = r4[r3]
            r4 = r6[r4]
            float r5 = r5 * r0
            r7.add(r4, r5, r9)
            int r2 = r2 + 1
        L31:
            int r3 = r3 + 1
            goto L15
        L34:
            return r0
    }
}
