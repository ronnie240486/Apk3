package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class SolverVariable implements java.lang.Comparable<androidx.constraintlayout.core.SolverVariable> {
    private static final boolean INTERNAL_DEBUG = false;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int uniqueConstantId = 1;
    private static int uniqueErrorId = 1;
    private static int uniqueId = 1;
    private static int uniqueSlackId = 1;
    private static int uniqueUnrestrictedId = 1;
    public float computedValue;
    public int definitionId;
    public float[] goalStrengthVector;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;
    public boolean isSynonym;
    public androidx.constraintlayout.core.ArrayRow[] mClientEquations;
    public int mClientEquationsCount;
    private java.lang.String mName;
    public androidx.constraintlayout.core.SolverVariable.Type mType;
    public int strength;
    public float[] strengthVector;
    public int synonym;
    public float synonymDelta;
    public int usageInRowCount;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.SolverVariable$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$SolverVariable$Type = null;

        static {
                androidx.constraintlayout.core.SolverVariable$Type[] r0 = androidx.constraintlayout.core.SolverVariable.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type = r0
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.CONSTANT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.SLACK     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.ERROR     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNKNOWN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }
    }

    public static final enum Type extends java.lang.Enum<androidx.constraintlayout.core.SolverVariable.Type> {
        private static final /* synthetic */ androidx.constraintlayout.core.SolverVariable.Type[] $VALUES = null;
        public static final androidx.constraintlayout.core.SolverVariable.Type CONSTANT = null;
        public static final androidx.constraintlayout.core.SolverVariable.Type ERROR = null;
        public static final androidx.constraintlayout.core.SolverVariable.Type SLACK = null;
        public static final androidx.constraintlayout.core.SolverVariable.Type UNKNOWN = null;
        public static final androidx.constraintlayout.core.SolverVariable.Type UNRESTRICTED = null;

        static {
                androidx.constraintlayout.core.SolverVariable$Type r0 = new androidx.constraintlayout.core.SolverVariable$Type
                java.lang.String r1 = "UNRESTRICTED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED = r0
                androidx.constraintlayout.core.SolverVariable$Type r1 = new androidx.constraintlayout.core.SolverVariable$Type
                java.lang.String r3 = "CONSTANT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.SolverVariable.Type.CONSTANT = r1
                androidx.constraintlayout.core.SolverVariable$Type r3 = new androidx.constraintlayout.core.SolverVariable$Type
                java.lang.String r5 = "SLACK"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.SolverVariable.Type.SLACK = r3
                androidx.constraintlayout.core.SolverVariable$Type r5 = new androidx.constraintlayout.core.SolverVariable$Type
                java.lang.String r7 = "ERROR"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.SolverVariable.Type.ERROR = r5
                androidx.constraintlayout.core.SolverVariable$Type r7 = new androidx.constraintlayout.core.SolverVariable$Type
                java.lang.String r9 = "UNKNOWN"
                r10 = 4
                r7.<init>(r9, r10)
                androidx.constraintlayout.core.SolverVariable.Type.UNKNOWN = r7
                r9 = 5
                androidx.constraintlayout.core.SolverVariable$Type[] r9 = new androidx.constraintlayout.core.SolverVariable.Type[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                androidx.constraintlayout.core.SolverVariable.Type.$VALUES = r9
                return
        }

        private Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.SolverVariable.Type valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.SolverVariable$Type> r0 = androidx.constraintlayout.core.SolverVariable.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.SolverVariable$Type r1 = (androidx.constraintlayout.core.SolverVariable.Type) r1
                return r1
        }

        public static androidx.constraintlayout.core.SolverVariable.Type[] values() {
                androidx.constraintlayout.core.SolverVariable$Type[] r0 = androidx.constraintlayout.core.SolverVariable.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.SolverVariable$Type[] r0 = (androidx.constraintlayout.core.SolverVariable.Type[]) r0
                return r0
        }
    }

    public SolverVariable(androidx.constraintlayout.core.SolverVariable.Type r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            r5 = -1
            r3.id = r5
            r3.definitionId = r5
            r0 = 0
            r3.strength = r0
            r3.isFinalValue = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.strengthVector = r2
            float[] r1 = new float[r1]
            r3.goalStrengthVector = r1
            r1 = 16
            androidx.constraintlayout.core.ArrayRow[] r1 = new androidx.constraintlayout.core.ArrayRow[r1]
            r3.mClientEquations = r1
            r3.mClientEquationsCount = r0
            r3.usageInRowCount = r0
            r3.isSynonym = r0
            r3.synonym = r5
            r5 = 0
            r3.synonymDelta = r5
            r3.mType = r4
            return
    }

    public SolverVariable(java.lang.String r5, androidx.constraintlayout.core.SolverVariable.Type r6) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.id = r0
            r4.definitionId = r0
            r1 = 0
            r4.strength = r1
            r4.isFinalValue = r1
            r2 = 9
            float[] r3 = new float[r2]
            r4.strengthVector = r3
            float[] r2 = new float[r2]
            r4.goalStrengthVector = r2
            r2 = 16
            androidx.constraintlayout.core.ArrayRow[] r2 = new androidx.constraintlayout.core.ArrayRow[r2]
            r4.mClientEquations = r2
            r4.mClientEquationsCount = r1
            r4.usageInRowCount = r1
            r4.isSynonym = r1
            r4.synonym = r0
            r0 = 0
            r4.synonymDelta = r0
            r4.mName = r5
            r4.mType = r6
            return
    }

    private static java.lang.String getUniqueName(androidx.constraintlayout.core.SolverVariable.Type r2, java.lang.String r3) {
            if (r3 == 0) goto L10
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            int r3 = androidx.constraintlayout.core.SolverVariable.uniqueErrorId
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L10:
            int[] r3 = androidx.constraintlayout.core.SolverVariable.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$SolverVariable$Type
            int r0 = r2.ordinal()
            r3 = r3[r0]
            r0 = 1
            if (r3 == r0) goto L7d
            r1 = 2
            if (r3 == r1) goto L6a
            r1 = 3
            if (r3 == r1) goto L57
            r1 = 4
            if (r3 == r1) goto L44
            r1 = 5
            if (r3 != r1) goto L3a
            java.lang.String r2 = "V"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = androidx.constraintlayout.core.SolverVariable.uniqueId
            int r3 = r3 + r0
            androidx.constraintlayout.core.SolverVariable.uniqueId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L3a:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r2 = r2.name()
            r3.<init>(r2)
            throw r3
        L44:
            java.lang.String r2 = "e"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = androidx.constraintlayout.core.SolverVariable.uniqueErrorId
            int r3 = r3 + r0
            androidx.constraintlayout.core.SolverVariable.uniqueErrorId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L57:
            java.lang.String r2 = "S"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = androidx.constraintlayout.core.SolverVariable.uniqueSlackId
            int r3 = r3 + r0
            androidx.constraintlayout.core.SolverVariable.uniqueSlackId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L6a:
            java.lang.String r2 = "C"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = androidx.constraintlayout.core.SolverVariable.uniqueConstantId
            int r3 = r3 + r0
            androidx.constraintlayout.core.SolverVariable.uniqueConstantId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
        L7d:
            java.lang.String r2 = "U"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = androidx.constraintlayout.core.SolverVariable.uniqueUnrestrictedId
            int r3 = r3 + r0
            androidx.constraintlayout.core.SolverVariable.uniqueUnrestrictedId = r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static void increaseErrorId() {
            int r0 = androidx.constraintlayout.core.SolverVariable.uniqueErrorId
            int r0 = r0 + 1
            androidx.constraintlayout.core.SolverVariable.uniqueErrorId = r0
            return
    }

    public final void addToRow(androidx.constraintlayout.core.ArrayRow r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mClientEquationsCount
            if (r0 >= r1) goto Lf
            androidx.constraintlayout.core.ArrayRow[] r1 = r3.mClientEquations
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            androidx.constraintlayout.core.ArrayRow[] r0 = r3.mClientEquations
            int r2 = r0.length
            if (r1 < r2) goto L1f
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.core.ArrayRow[] r0 = (androidx.constraintlayout.core.ArrayRow[]) r0
            r3.mClientEquations = r0
        L1f:
            androidx.constraintlayout.core.ArrayRow[] r0 = r3.mClientEquations
            int r1 = r3.mClientEquationsCount
            r0[r1] = r4
            int r1 = r1 + 1
            r3.mClientEquationsCount = r1
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.constraintlayout.core.SolverVariable r2) {
            r1 = this;
            int r0 = r1.id
            int r2 = r2.id
            int r0 = r0 - r2
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.constraintlayout.core.SolverVariable r1) {
            r0 = this;
            androidx.constraintlayout.core.SolverVariable r1 = (androidx.constraintlayout.core.SolverVariable) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public final void removeFromRow(androidx.constraintlayout.core.ArrayRow r5) {
            r4 = this;
            int r0 = r4.mClientEquationsCount
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            androidx.constraintlayout.core.ArrayRow[] r2 = r4.mClientEquations
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            androidx.constraintlayout.core.ArrayRow[] r5 = r4.mClientEquations
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.mClientEquationsCount
            int r5 = r5 + (-1)
            r4.mClientEquationsCount = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    public void reset() {
            r6 = this;
            r0 = 0
            r6.mName = r0
            androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNKNOWN
            r6.mType = r1
            r1 = 0
            r6.strength = r1
            r2 = -1
            r6.id = r2
            r6.definitionId = r2
            r3 = 0
            r6.computedValue = r3
            r6.isFinalValue = r1
            r6.isSynonym = r1
            r6.synonym = r2
            r6.synonymDelta = r3
            int r2 = r6.mClientEquationsCount
            r4 = 0
        L1d:
            if (r4 >= r2) goto L26
            androidx.constraintlayout.core.ArrayRow[] r5 = r6.mClientEquations
            r5[r4] = r0
            int r4 = r4 + 1
            goto L1d
        L26:
            r6.mClientEquationsCount = r1
            r6.usageInRowCount = r1
            r6.inGoal = r1
            float[] r0 = r6.goalStrengthVector
            java.util.Arrays.fill(r0, r3)
            return
    }

    public void setFinalValue(androidx.constraintlayout.core.LinearSystem r4, float r5) {
            r3 = this;
            r3.computedValue = r5
            r5 = 1
            r3.isFinalValue = r5
            r5 = 0
            r3.isSynonym = r5
            r0 = -1
            r3.synonym = r0
            r1 = 0
            r3.synonymDelta = r1
            int r1 = r3.mClientEquationsCount
            r3.definitionId = r0
            r0 = 0
        L13:
            if (r0 >= r1) goto L1f
            androidx.constraintlayout.core.ArrayRow[] r2 = r3.mClientEquations
            r2 = r2[r0]
            r2.updateFromFinalVariable(r4, r3, r5)
            int r0 = r0 + 1
            goto L13
        L1f:
            r3.mClientEquationsCount = r5
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.mName = r1
            return
    }

    public void setSynonym(androidx.constraintlayout.core.LinearSystem r3, androidx.constraintlayout.core.SolverVariable r4, float r5) {
            r2 = this;
            r0 = 1
            r2.isSynonym = r0
            int r4 = r4.id
            r2.synonym = r4
            r2.synonymDelta = r5
            int r4 = r2.mClientEquationsCount
            r5 = -1
            r2.definitionId = r5
            r5 = 0
            r0 = 0
        L10:
            if (r0 >= r4) goto L1c
            androidx.constraintlayout.core.ArrayRow[] r1 = r2.mClientEquations
            r1 = r1[r0]
            r1.updateFromSynonymVariable(r3, r2, r5)
            int r0 = r0 + 1
            goto L10
        L1c:
            r2.mClientEquationsCount = r5
            r3.displayReadableRows()
            return
    }

    public void setType(androidx.constraintlayout.core.SolverVariable.Type r1, java.lang.String r2) {
            r0 = this;
            r0.mType = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.mName
            java.lang.String r1 = ""
            if (r0 == 0) goto L14
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r1 = r2.mName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L21
        L14:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r1 = r2.id
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L21:
            return r0
    }

    public final void updateReferencesWithNewDefinition(androidx.constraintlayout.core.LinearSystem r5, androidx.constraintlayout.core.ArrayRow r6) {
            r4 = this;
            int r0 = r4.mClientEquationsCount
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r0) goto L10
            androidx.constraintlayout.core.ArrayRow[] r3 = r4.mClientEquations
            r3 = r3[r2]
            r3.updateFromRow(r5, r6, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.mClientEquationsCount = r1
            return
    }
}
