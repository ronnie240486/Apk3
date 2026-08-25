package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    public static final boolean FULL_DEBUG = false;
    public static final boolean MEASURE = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    private static int POOL_SIZE = 1000;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static androidx.constraintlayout.core.Metrics sMetrics;
    private int TABLE_SIZE;
    public boolean graphOptimizer;
    public boolean hasSimpleDefinition;
    private boolean[] mAlreadyTestedCandidates;
    public final androidx.constraintlayout.core.Cache mCache;
    private androidx.constraintlayout.core.LinearSystem.Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    public int mNumColumns;
    public int mNumRows;
    private androidx.constraintlayout.core.SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    public androidx.constraintlayout.core.ArrayRow[] mRows;
    private androidx.constraintlayout.core.LinearSystem.Row mTempGoal;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> mVariables;
    public int mVariablesID;
    public boolean newgraphOptimizer;

    public interface Row {
        void addError(androidx.constraintlayout.core.SolverVariable r1);

        void clear();

        androidx.constraintlayout.core.SolverVariable getKey();

        androidx.constraintlayout.core.SolverVariable getPivotCandidate(androidx.constraintlayout.core.LinearSystem r1, boolean[] r2);

        void initFromRow(androidx.constraintlayout.core.LinearSystem.Row r1);

        boolean isEmpty();

        void updateFromFinalVariable(androidx.constraintlayout.core.LinearSystem r1, androidx.constraintlayout.core.SolverVariable r2, boolean r3);

        void updateFromRow(androidx.constraintlayout.core.LinearSystem r1, androidx.constraintlayout.core.ArrayRow r2, boolean r3);

        void updateFromSystem(androidx.constraintlayout.core.LinearSystem r1);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class ValuesRow extends androidx.constraintlayout.core.ArrayRow {
        public ValuesRow(androidx.constraintlayout.core.LinearSystem r1, androidx.constraintlayout.core.Cache r2) {
                r0 = this;
                r0.<init>()
                androidx.constraintlayout.core.SolverVariableValues r1 = new androidx.constraintlayout.core.SolverVariableValues
                r1.<init>(r0, r2)
                r0.variables = r1
                return
        }
    }

    public LinearSystem() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.hasSimpleDefinition = r0
            r3.mVariablesID = r0
            r1 = 0
            r3.mVariables = r1
            r2 = 32
            r3.TABLE_SIZE = r2
            r3.mMaxColumns = r2
            r3.mRows = r1
            r3.graphOptimizer = r0
            r3.newgraphOptimizer = r0
            boolean[] r1 = new boolean[r2]
            r3.mAlreadyTestedCandidates = r1
            r1 = 1
            r3.mNumColumns = r1
            r3.mNumRows = r0
            r3.mMaxRows = r2
            int r1 = androidx.constraintlayout.core.LinearSystem.POOL_SIZE
            androidx.constraintlayout.core.SolverVariable[] r1 = new androidx.constraintlayout.core.SolverVariable[r1]
            r3.mPoolVariables = r1
            r3.mPoolVariablesCount = r0
            androidx.constraintlayout.core.ArrayRow[] r0 = new androidx.constraintlayout.core.ArrayRow[r2]
            r3.mRows = r0
            r3.releaseRows()
            androidx.constraintlayout.core.Cache r0 = new androidx.constraintlayout.core.Cache
            r0.<init>()
            r3.mCache = r0
            androidx.constraintlayout.core.PriorityGoalRow r1 = new androidx.constraintlayout.core.PriorityGoalRow
            r1.<init>(r0)
            r3.mGoal = r1
            boolean r1 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r1 == 0) goto L4b
            androidx.constraintlayout.core.LinearSystem$ValuesRow r1 = new androidx.constraintlayout.core.LinearSystem$ValuesRow
            r1.<init>(r3, r0)
            r3.mTempGoal = r1
            goto L52
        L4b:
            androidx.constraintlayout.core.ArrayRow r1 = new androidx.constraintlayout.core.ArrayRow
            r1.<init>(r0)
            r3.mTempGoal = r1
        L52:
            return
    }

    private androidx.constraintlayout.core.SolverVariable acquireSolverVariable(androidx.constraintlayout.core.SolverVariable.Type r3, java.lang.String r4) {
            r2 = this;
            androidx.constraintlayout.core.Cache r0 = r2.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.SolverVariable> r0 = r0.solverVariablePool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.core.SolverVariable r0 = (androidx.constraintlayout.core.SolverVariable) r0
            if (r0 != 0) goto L15
            androidx.constraintlayout.core.SolverVariable r0 = new androidx.constraintlayout.core.SolverVariable
            r0.<init>(r3, r4)
            r0.setType(r3, r4)
            goto L1b
        L15:
            r0.reset()
            r0.setType(r3, r4)
        L1b:
            int r3 = r2.mPoolVariablesCount
            int r4 = androidx.constraintlayout.core.LinearSystem.POOL_SIZE
            if (r3 < r4) goto L2f
            int r4 = r4 * 2
            androidx.constraintlayout.core.LinearSystem.POOL_SIZE = r4
            androidx.constraintlayout.core.SolverVariable[] r3 = r2.mPoolVariables
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            androidx.constraintlayout.core.SolverVariable[] r3 = (androidx.constraintlayout.core.SolverVariable[]) r3
            r2.mPoolVariables = r3
        L2f:
            androidx.constraintlayout.core.SolverVariable[] r3 = r2.mPoolVariables
            int r4 = r2.mPoolVariablesCount
            int r1 = r4 + 1
            r2.mPoolVariablesCount = r1
            r3[r4] = r0
            return r0
    }

    private void addError(androidx.constraintlayout.core.ArrayRow r2) {
            r1 = this;
            r0 = 0
            r2.addError(r1, r0)
            return
    }

    private final void addRow(androidx.constraintlayout.core.ArrayRow r8) {
            r7 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r0 == 0) goto L10
            boolean r0 = r8.isSimpleDefinition
            if (r0 == 0) goto L10
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            float r8 = r8.constantValue
            r0.setFinalValue(r7, r8)
            goto L21
        L10:
            androidx.constraintlayout.core.ArrayRow[] r0 = r7.mRows
            int r1 = r7.mNumRows
            r0[r1] = r8
            androidx.constraintlayout.core.SolverVariable r0 = r8.variable
            r0.definitionId = r1
            int r1 = r1 + 1
            r7.mNumRows = r1
            r0.updateReferencesWithNewDefinition(r7, r8)
        L21:
            boolean r8 = androidx.constraintlayout.core.LinearSystem.SIMPLIFY_SYNONYMS
            if (r8 == 0) goto L9d
            boolean r8 = r7.hasSimpleDefinition
            if (r8 == 0) goto L9d
            r8 = 0
            r0 = 0
        L2b:
            int r1 = r7.mNumRows
            if (r0 >= r1) goto L9b
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1 = r1[r0]
            if (r1 != 0) goto L3c
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "WTF"
            r1.println(r2)
        L3c:
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r2 = r1[r0]
            if (r2 == 0) goto L98
            r2 = r1[r0]
            boolean r2 = r2.isSimpleDefinition
            if (r2 == 0) goto L98
            r1 = r1[r0]
            androidx.constraintlayout.core.SolverVariable r2 = r1.variable
            float r3 = r1.constantValue
            r2.setFinalValue(r7, r3)
            boolean r2 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r2 == 0) goto L5d
            androidx.constraintlayout.core.Cache r2 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r2 = r2.optimizedArrayRowPool
            r2.release(r1)
            goto L64
        L5d:
            androidx.constraintlayout.core.Cache r2 = r7.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r2 = r2.arrayRowPool
            r2.release(r1)
        L64:
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r2 = 0
            r1[r0] = r2
            int r1 = r0 + 1
            r3 = r1
        L6c:
            int r4 = r7.mNumRows
            if (r1 >= r4) goto L8c
            androidx.constraintlayout.core.ArrayRow[] r3 = r7.mRows
            int r4 = r1 + (-1)
            r5 = r3[r1]
            r3[r4] = r5
            r5 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r5 = r5.variable
            int r5 = r5.definitionId
            if (r5 != r1) goto L86
            r3 = r3[r4]
            androidx.constraintlayout.core.SolverVariable r3 = r3.variable
            r3.definitionId = r4
        L86:
            int r3 = r1 + 1
            r6 = r3
            r3 = r1
            r1 = r6
            goto L6c
        L8c:
            if (r3 >= r4) goto L92
            androidx.constraintlayout.core.ArrayRow[] r1 = r7.mRows
            r1[r3] = r2
        L92:
            int r4 = r4 + (-1)
            r7.mNumRows = r4
            int r0 = r0 + (-1)
        L98:
            int r0 = r0 + 1
            goto L2b
        L9b:
            r7.hasSimpleDefinition = r8
        L9d:
            return
    }

    private void addSingleError(androidx.constraintlayout.core.ArrayRow r2, int r3) {
            r1 = this;
            r0 = 0
            r1.addSingleError(r2, r3, r0)
            return
    }

    private void computeValues() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mNumRows
            if (r0 >= r1) goto L12
            androidx.constraintlayout.core.ArrayRow[] r1 = r3.mRows
            r1 = r1[r0]
            androidx.constraintlayout.core.SolverVariable r2 = r1.variable
            float r1 = r1.constantValue
            r2.computedValue = r1
            int r0 = r0 + 1
            goto L1
        L12:
            return
    }

    public static androidx.constraintlayout.core.ArrayRow createRowDimensionPercent(androidx.constraintlayout.core.LinearSystem r2, androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, float r5) {
            androidx.constraintlayout.core.ArrayRow r2 = r2.createRow()
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r2.variables
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.put(r3, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r2.variables
            r3.put(r4, r5)
            return r2
    }

    private androidx.constraintlayout.core.SolverVariable createVariable(java.lang.String r6, androidx.constraintlayout.core.SolverVariable.Type r7) {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.variables
            r3 = 1
            long r1 = r1 + r3
            r0.variables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            r0 = 0
            androidx.constraintlayout.core.SolverVariable r7 = r5.acquireSolverVariable(r7, r0)
            r7.setName(r6)
            int r0 = r5.mVariablesID
            int r0 = r0 + 1
            r5.mVariablesID = r0
            int r1 = r5.mNumColumns
            int r1 = r1 + 1
            r5.mNumColumns = r1
            r7.id = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r0 = r5.mVariables
            if (r0 != 0) goto L37
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.mVariables = r0
        L37:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r0 = r5.mVariables
            r0.put(r6, r7)
            androidx.constraintlayout.core.Cache r6 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r6 = r6.mIndexedVariables
            int r0 = r5.mVariablesID
            r6[r0] = r7
            return r7
    }

    private void displayRows() {
            r4 = this;
            r4.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
        L6:
            int r2 = r4.mNumRows
            java.lang.String r3 = "\n"
            if (r1 >= r2) goto L22
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.ArrayRow[] r2 = r4.mRows
            r2 = r2[r1]
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
            int r1 = r1 + 1
            goto L6
        L22:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.LinearSystem$Row r1 = r4.mGoal
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    private void displaySolverVariables() {
            r3 = this;
            java.lang.String r0 = "Display Rows ("
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r3.mNumRows
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r1 = r3.mNumColumns
            java.lang.String r2 = ")\n"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    private int enforceBFS(androidx.constraintlayout.core.LinearSystem.Row r20) throws java.lang.Exception {
            r19 = this;
            r0 = r19
            r2 = 0
        L3:
            int r3 = r0.mNumRows
            r4 = 0
            if (r2 >= r3) goto L22
            androidx.constraintlayout.core.ArrayRow[] r3 = r0.mRows
            r6 = r3[r2]
            androidx.constraintlayout.core.SolverVariable r6 = r6.variable
            androidx.constraintlayout.core.SolverVariable$Type r6 = r6.mType
            androidx.constraintlayout.core.SolverVariable$Type r7 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r6 != r7) goto L15
            goto L1f
        L15:
            r3 = r3[r2]
            float r3 = r3.constantValue
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L1f
            r2 = 1
            goto L23
        L1f:
            int r2 = r2 + 1
            goto L3
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L109
            r2 = 0
            r3 = 0
        L27:
            if (r2 != 0) goto L107
            androidx.constraintlayout.core.Metrics r6 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r7 = 1
            if (r6 == 0) goto L34
            long r9 = r6.bfs
            long r9 = r9 + r7
            r6.bfs = r9
        L34:
            int r3 = r3 + 1
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
        L3d:
            int r14 = r0.mNumRows
            if (r10 >= r14) goto Ld6
            androidx.constraintlayout.core.ArrayRow[] r14 = r0.mRows
            r14 = r14[r10]
            androidx.constraintlayout.core.SolverVariable r15 = r14.variable
            androidx.constraintlayout.core.SolverVariable$Type r15 = r15.mType
            androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r15 != r1) goto L4f
            goto Ld0
        L4f:
            boolean r1 = r14.isSimpleDefinition
            if (r1 == 0) goto L55
            goto Ld0
        L55:
            float r1 = r14.constantValue
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto Ld0
            boolean r1 = androidx.constraintlayout.core.LinearSystem.SKIP_COLUMNS
            r15 = 9
            if (r1 == 0) goto L9c
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r14.variables
            int r1 = r1.getCurrentSize()
            r5 = 0
        L68:
            if (r5 >= r1) goto Ld0
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r14.variables
            androidx.constraintlayout.core.SolverVariable r7 = r7.getVariable(r5)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r8 = r14.variables
            float r8 = r8.get(r7)
            int r16 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r16 > 0) goto L7b
            goto L95
        L7b:
            r9 = 0
        L7c:
            if (r9 >= r15) goto L95
            float[] r15 = r7.strengthVector
            r15 = r15[r9]
            float r15 = r15 / r8
            int r18 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r18 >= 0) goto L89
            if (r9 == r13) goto L8b
        L89:
            if (r9 <= r13) goto L90
        L8b:
            int r12 = r7.id
            r13 = r9
            r11 = r10
            r6 = r15
        L90:
            int r9 = r9 + 1
            r15 = 9
            goto L7c
        L95:
            int r5 = r5 + 1
            r7 = 1
            r15 = 9
            goto L68
        L9c:
            r1 = 1
        L9d:
            int r5 = r0.mNumColumns
            if (r1 >= r5) goto Ld0
            androidx.constraintlayout.core.Cache r5 = r0.mCache
            androidx.constraintlayout.core.SolverVariable[] r5 = r5.mIndexedVariables
            r5 = r5[r1]
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r14.variables
            float r7 = r7.get(r5)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 > 0) goto Lb4
            r9 = 9
            goto Lcd
        Lb4:
            r8 = 0
            r9 = 9
        Lb7:
            if (r8 >= r9) goto Lcd
            float[] r15 = r5.strengthVector
            r15 = r15[r8]
            float r15 = r15 / r7
            int r17 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r17 >= 0) goto Lc4
            if (r8 == r13) goto Lc6
        Lc4:
            if (r8 <= r13) goto Lca
        Lc6:
            r12 = r1
            r13 = r8
            r11 = r10
            r6 = r15
        Lca:
            int r8 = r8 + 1
            goto Lb7
        Lcd:
            int r1 = r1 + 1
            goto L9d
        Ld0:
            int r10 = r10 + 1
            r7 = 1
            goto L3d
        Ld6:
            r1 = -1
            if (r11 == r1) goto Lfd
            androidx.constraintlayout.core.ArrayRow[] r5 = r0.mRows
            r5 = r5[r11]
            androidx.constraintlayout.core.SolverVariable r6 = r5.variable
            r6.definitionId = r1
            androidx.constraintlayout.core.Metrics r1 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r1 == 0) goto Lec
            long r6 = r1.pivots
            r8 = 1
            long r6 = r6 + r8
            r1.pivots = r6
        Lec:
            androidx.constraintlayout.core.Cache r1 = r0.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r1 = r1[r12]
            r5.pivot(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r5.variable
            r1.definitionId = r11
            r1.updateReferencesWithNewDefinition(r0, r5)
            goto Lfe
        Lfd:
            r2 = 1
        Lfe:
            int r1 = r0.mNumColumns
            int r1 = r1 / 2
            if (r3 <= r1) goto L27
            r2 = 1
            goto L27
        L107:
            r1 = r3
            goto L10a
        L109:
            r1 = 0
        L10a:
            return r1
    }

    private java.lang.String getDisplaySize(int r4) {
            r3 = this;
            int r4 = r4 * 4
            int r0 = r4 / 1024
            int r1 = r0 / 1024
            java.lang.String r2 = ""
            if (r1 <= 0) goto L11
            java.lang.String r4 = " Mb"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r1, r4)
            return r4
        L11:
            if (r0 <= 0) goto L1a
            java.lang.String r4 = " Kb"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r0, r4)
            return r4
        L1a:
            java.lang.String r0 = " bytes"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2, r4, r0)
            return r4
    }

    private java.lang.String getDisplayStrength(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L6
            java.lang.String r2 = "LOW"
            return r2
        L6:
            r0 = 2
            if (r2 != r0) goto Lc
            java.lang.String r2 = "MEDIUM"
            return r2
        Lc:
            r0 = 3
            if (r2 != r0) goto L12
            java.lang.String r2 = "HIGH"
            return r2
        L12:
            r0 = 4
            if (r2 != r0) goto L18
            java.lang.String r2 = "HIGHEST"
            return r2
        L18:
            r0 = 5
            if (r2 != r0) goto L1e
            java.lang.String r2 = "EQUALITY"
            return r2
        L1e:
            r0 = 8
            if (r2 != r0) goto L25
            java.lang.String r2 = "FIXED"
            return r2
        L25:
            r0 = 6
            if (r2 != r0) goto L2b
            java.lang.String r2 = "BARRIER"
            return r2
        L2b:
            java.lang.String r2 = "NONE"
            return r2
    }

    public static androidx.constraintlayout.core.Metrics getMetrics() {
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            return r0
    }

    private void increaseTableSize() {
            r6 = this;
            int r0 = r6.TABLE_SIZE
            int r0 = r0 * 2
            r6.TABLE_SIZE = r0
            androidx.constraintlayout.core.ArrayRow[] r1 = r6.mRows
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            androidx.constraintlayout.core.ArrayRow[] r0 = (androidx.constraintlayout.core.ArrayRow[]) r0
            r6.mRows = r0
            androidx.constraintlayout.core.Cache r0 = r6.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r0.mIndexedVariables
            int r2 = r6.TABLE_SIZE
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            androidx.constraintlayout.core.SolverVariable[] r1 = (androidx.constraintlayout.core.SolverVariable[]) r1
            r0.mIndexedVariables = r1
            int r0 = r6.TABLE_SIZE
            boolean[] r1 = new boolean[r0]
            r6.mAlreadyTestedCandidates = r1
            r6.mMaxColumns = r0
            r6.mMaxRows = r0
            androidx.constraintlayout.core.Metrics r1 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r1 == 0) goto L42
            long r2 = r1.tableSizeIncrease
            r4 = 1
            long r2 = r2 + r4
            r1.tableSizeIncrease = r2
            long r2 = r1.maxTableSize
            long r4 = (long) r0
            long r2 = java.lang.Math.max(r2, r4)
            r1.maxTableSize = r2
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.maxTableSize
            r0.lastTableSize = r1
        L42:
            return
    }

    private final int optimize(androidx.constraintlayout.core.LinearSystem.Row r13, boolean r14) {
            r12 = this;
            androidx.constraintlayout.core.Metrics r14 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r0 = 1
            if (r14 == 0) goto Lb
            long r2 = r14.optimize
            long r2 = r2 + r0
            r14.optimize = r2
        Lb:
            r14 = 0
            r2 = 0
        Ld:
            int r3 = r12.mNumColumns
            if (r2 >= r3) goto L18
            boolean[] r3 = r12.mAlreadyTestedCandidates
            r3[r2] = r14
            int r2 = r2 + 1
            goto Ld
        L18:
            r2 = 0
            r3 = 0
        L1a:
            if (r2 != 0) goto Lb2
            androidx.constraintlayout.core.Metrics r4 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r4 == 0) goto L25
            long r5 = r4.iterations
            long r5 = r5 + r0
            r4.iterations = r5
        L25:
            int r3 = r3 + 1
            int r4 = r12.mNumColumns
            int r4 = r4 * 2
            if (r3 < r4) goto L2e
            return r3
        L2e:
            androidx.constraintlayout.core.SolverVariable r4 = r13.getKey()
            r5 = 1
            if (r4 == 0) goto L3f
            boolean[] r4 = r12.mAlreadyTestedCandidates
            androidx.constraintlayout.core.SolverVariable r6 = r13.getKey()
            int r6 = r6.id
            r4[r6] = r5
        L3f:
            boolean[] r4 = r12.mAlreadyTestedCandidates
            androidx.constraintlayout.core.SolverVariable r4 = r13.getPivotCandidate(r12, r4)
            if (r4 == 0) goto L52
            boolean[] r6 = r12.mAlreadyTestedCandidates
            int r7 = r4.id
            boolean r8 = r6[r7]
            if (r8 == 0) goto L50
            return r3
        L50:
            r6[r7] = r5
        L52:
            if (r4 == 0) goto Laf
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r6 = -1
            r7 = 0
            r8 = -1
        L5a:
            int r9 = r12.mNumRows
            if (r7 >= r9) goto L90
            androidx.constraintlayout.core.ArrayRow[] r9 = r12.mRows
            r9 = r9[r7]
            androidx.constraintlayout.core.SolverVariable r10 = r9.variable
            androidx.constraintlayout.core.SolverVariable$Type r10 = r10.mType
            androidx.constraintlayout.core.SolverVariable$Type r11 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r10 != r11) goto L6b
            goto L8d
        L6b:
            boolean r10 = r9.isSimpleDefinition
            if (r10 == 0) goto L70
            goto L8d
        L70:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r10 = r9.variables
            boolean r10 = r10.contains(r4)
            if (r10 == 0) goto L8d
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r10 = r9.variables
            float r10 = r10.get(r4)
            r11 = 0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L8d
            float r9 = r9.constantValue
            float r9 = -r9
            float r9 = r9 / r10
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L8d
            r8 = r7
            r5 = r9
        L8d:
            int r7 = r7 + 1
            goto L5a
        L90:
            if (r8 <= r6) goto L1a
            androidx.constraintlayout.core.ArrayRow[] r5 = r12.mRows
            r5 = r5[r8]
            androidx.constraintlayout.core.SolverVariable r7 = r5.variable
            r7.definitionId = r6
            androidx.constraintlayout.core.Metrics r6 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r6 == 0) goto La3
            long r9 = r6.pivots
            long r9 = r9 + r0
            r6.pivots = r9
        La3:
            r5.pivot(r4)
            androidx.constraintlayout.core.SolverVariable r4 = r5.variable
            r4.definitionId = r8
            r4.updateReferencesWithNewDefinition(r12, r5)
            goto L1a
        Laf:
            r2 = 1
            goto L1a
        Lb2:
            return r3
    }

    private void releaseRows() {
            r4 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1e
        L6:
            int r0 = r4.mNumRows
            if (r2 >= r0) goto L36
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0 = r0[r2]
            if (r0 == 0) goto L17
            androidx.constraintlayout.core.Cache r3 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r3 = r3.optimizedArrayRowPool
            r3.release(r0)
        L17:
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0[r2] = r1
            int r2 = r2 + 1
            goto L6
        L1e:
            int r0 = r4.mNumRows
            if (r2 >= r0) goto L36
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0 = r0[r2]
            if (r0 == 0) goto L2f
            androidx.constraintlayout.core.Cache r3 = r4.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r3 = r3.arrayRowPool
            r3.release(r0)
        L2f:
            androidx.constraintlayout.core.ArrayRow[] r0 = r4.mRows
            r0[r2] = r1
            int r2 = r2 + 1
            goto L1e
        L36:
            return
    }

    public void addCenterPoint(androidx.constraintlayout.core.widgets.ConstraintWidget r17, androidx.constraintlayout.core.widgets.ConstraintWidget r18, float r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.getAnchor(r3)
            androidx.constraintlayout.core.SolverVariable r6 = r0.createObjectVariable(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r8 = r0.createObjectVariable(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r1.getAnchor(r5)
            androidx.constraintlayout.core.SolverVariable r13 = r0.createObjectVariable(r7)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.getAnchor(r7)
            androidx.constraintlayout.core.SolverVariable r9 = r0.createObjectVariable(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.getAnchor(r3)
            androidx.constraintlayout.core.SolverVariable r1 = r0.createObjectVariable(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r10 = r0.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.getAnchor(r5)
            androidx.constraintlayout.core.SolverVariable r3 = r0.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.getAnchor(r7)
            androidx.constraintlayout.core.SolverVariable r11 = r0.createObjectVariable(r2)
            androidx.constraintlayout.core.ArrayRow r2 = r16.createRow()
            r4 = r19
            double r4 = (double) r4
            double r14 = java.lang.Math.sin(r4)
            r7 = r20
            r17 = r3
            r18 = r4
            double r3 = (double) r7
            double r14 = r14 * r3
            float r12 = (float) r14
            r7 = r2
            r7.createRowWithAngle(r8, r9, r10, r11, r12)
            r0.addConstraint(r2)
            androidx.constraintlayout.core.ArrayRow r2 = r16.createRow()
            double r7 = java.lang.Math.cos(r18)
            double r7 = r7 * r3
            float r10 = (float) r7
            r5 = r2
            r7 = r13
            r8 = r1
            r9 = r17
            r5.createRowWithAngle(r6, r7, r8, r9, r10)
            r0.addConstraint(r2)
            return
    }

    public void addCentering(androidx.constraintlayout.core.SolverVariable r7, androidx.constraintlayout.core.SolverVariable r8, int r9, float r10, androidx.constraintlayout.core.SolverVariable r11, androidx.constraintlayout.core.SolverVariable r12, int r13, int r14) {
            r6 = this;
            androidx.constraintlayout.core.ArrayRow r0 = r6.createRow()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r8 != r11) goto L1b
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r9 = r0.variables
            r9.put(r7, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r12, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r9 = -1073741824(0xffffffffc0000000, float:-2.0)
            r7.put(r8, r9)
            goto L93
        L1b:
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 != 0) goto L41
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r10 = r0.variables
            r10.put(r7, r1)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r8, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r11, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r12, r1)
            if (r9 > 0) goto L3b
            if (r13 <= 0) goto L93
        L3b:
            int r7 = -r9
            int r7 = r7 + r13
            float r7 = (float) r7
            r0.constantValue = r7
            goto L93
        L41:
            r2 = 0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L54
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r10 = r0.variables
            r10.put(r7, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r8, r1)
            float r7 = (float) r9
            r0.constantValue = r7
            goto L93
        L54:
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L67
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r12, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            r7.put(r11, r1)
            int r7 = -r13
            float r7 = (float) r7
            r0.constantValue = r7
            goto L93
        L67:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r0.variables
            float r4 = r1 - r10
            float r5 = r4 * r1
            r2.put(r7, r5)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            float r2 = r4 * r3
            r7.put(r8, r2)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            float r3 = r3 * r10
            r7.put(r11, r3)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r7 = r0.variables
            float r1 = r1 * r10
            r7.put(r12, r1)
            if (r9 > 0) goto L89
            if (r13 <= 0) goto L93
        L89:
            int r7 = -r9
            float r7 = (float) r7
            float r7 = r7 * r4
            float r8 = (float) r13
            float r8 = r8 * r10
            float r8 = r8 + r7
            r0.constantValue = r8
        L93:
            r7 = 8
            if (r14 == r7) goto L9a
            r0.addError(r6, r14)
        L9a:
            r6.addConstraint(r0)
            return
    }

    public void addConstraint(androidx.constraintlayout.core.ArrayRow r10) {
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.constraints
            long r3 = r3 + r1
            r0.constraints = r3
            boolean r3 = r10.isSimpleDefinition
            if (r3 == 0) goto L17
            long r3 = r0.simpleconstraints
            long r3 = r3 + r1
            r0.simpleconstraints = r3
        L17:
            int r0 = r9.mNumRows
            r3 = 1
            int r0 = r0 + r3
            int r4 = r9.mMaxRows
            if (r0 >= r4) goto L26
            int r0 = r9.mNumColumns
            int r0 = r0 + r3
            int r4 = r9.mMaxColumns
            if (r0 < r4) goto L29
        L26:
            r9.increaseTableSize()
        L29:
            boolean r0 = r10.isSimpleDefinition
            r4 = 0
            if (r0 != 0) goto Lbf
            r10.updateFromSystem(r9)
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L38
            return
        L38:
            float r0 = r10.constantValue
            r5 = 0
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 >= 0) goto L4a
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r6
            r10.constantValue = r0
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r0 = r10.variables
            r0.invert()
        L4a:
            boolean r0 = r10.chooseSubject(r9)
            if (r0 == 0) goto La8
            androidx.constraintlayout.core.SolverVariable r0 = r9.createExtraVariable()
            r10.variable = r0
            int r6 = r9.mNumRows
            r9.addRow(r10)
            int r7 = r9.mNumRows
            int r6 = r6 + r3
            if (r7 != r6) goto La8
            androidx.constraintlayout.core.LinearSystem$Row r6 = r9.mTempGoal
            r6.initFromRow(r10)
            androidx.constraintlayout.core.LinearSystem$Row r6 = r9.mTempGoal
            r9.optimize(r6, r3)
            int r6 = r0.definitionId
            r7 = -1
            if (r6 != r7) goto La6
            androidx.constraintlayout.core.SolverVariable r6 = r10.variable
            if (r6 != r0) goto L85
            androidx.constraintlayout.core.SolverVariable r0 = r10.pickPivot(r0)
            if (r0 == 0) goto L85
            androidx.constraintlayout.core.Metrics r6 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r6 == 0) goto L82
            long r7 = r6.pivots
            long r7 = r7 + r1
            r6.pivots = r7
        L82:
            r10.pivot(r0)
        L85:
            boolean r0 = r10.isSimpleDefinition
            if (r0 != 0) goto L8e
            androidx.constraintlayout.core.SolverVariable r0 = r10.variable
            r0.updateReferencesWithNewDefinition(r9, r10)
        L8e:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L9a
            androidx.constraintlayout.core.Cache r0 = r9.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            r0.release(r10)
            goto La1
        L9a:
            androidx.constraintlayout.core.Cache r0 = r9.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            r0.release(r10)
        La1:
            int r0 = r9.mNumRows
            int r0 = r0 - r3
            r9.mNumRows = r0
        La6:
            r0 = 1
            goto La9
        La8:
            r0 = 0
        La9:
            androidx.constraintlayout.core.SolverVariable r1 = r10.variable
            if (r1 == 0) goto Lba
            androidx.constraintlayout.core.SolverVariable$Type r1 = r1.mType
            androidx.constraintlayout.core.SolverVariable$Type r2 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r1 == r2) goto Lbb
            float r1 = r10.constantValue
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto Lba
            goto Lbb
        Lba:
            r3 = 0
        Lbb:
            if (r3 != 0) goto Lbe
            return
        Lbe:
            r4 = r0
        Lbf:
            if (r4 != 0) goto Lc4
            r9.addRow(r10)
        Lc4:
            return
    }

    public androidx.constraintlayout.core.ArrayRow addEquality(androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6, int r7) {
            r3 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.USE_BASIC_SYNONYMS
            r1 = 8
            if (r0 == 0) goto L1a
            if (r7 != r1) goto L1a
            boolean r0 = r5.isFinalValue
            if (r0 == 0) goto L1a
            int r0 = r4.definitionId
            r2 = -1
            if (r0 != r2) goto L1a
            float r5 = r5.computedValue
            float r6 = (float) r6
            float r5 = r5 + r6
            r4.setFinalValue(r3, r5)
            r4 = 0
            return r4
        L1a:
            androidx.constraintlayout.core.ArrayRow r0 = r3.createRow()
            r0.createRowEquals(r4, r5, r6)
            if (r7 == r1) goto L26
            r0.addError(r3, r7)
        L26:
            r3.addConstraint(r0)
            return r0
    }

    public void addEquality(androidx.constraintlayout.core.SolverVariable r6, int r7) {
            r5 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.USE_BASIC_SYNONYMS
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L30
            int r0 = r6.definitionId
            if (r0 != r1) goto L30
            float r7 = (float) r7
            r6.setFinalValue(r5, r7)
            r0 = 0
        Lf:
            int r1 = r5.mVariablesID
            int r1 = r1 + r2
            if (r0 >= r1) goto L2f
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r1 = r1[r0]
            if (r1 == 0) goto L2c
            boolean r3 = r1.isSynonym
            if (r3 == 0) goto L2c
            int r3 = r1.synonym
            int r4 = r6.id
            if (r3 != r4) goto L2c
            float r3 = r1.synonymDelta
            float r3 = r3 + r7
            r1.setFinalValue(r5, r3)
        L2c:
            int r0 = r0 + 1
            goto Lf
        L2f:
            return
        L30:
            int r0 = r6.definitionId
            if (r0 == r1) goto L59
            androidx.constraintlayout.core.ArrayRow[] r1 = r5.mRows
            r0 = r1[r0]
            boolean r1 = r0.isSimpleDefinition
            if (r1 == 0) goto L40
            float r6 = (float) r7
            r0.constantValue = r6
            goto L69
        L40:
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r1 = r0.variables
            int r1 = r1.getCurrentSize()
            if (r1 != 0) goto L4e
            r0.isSimpleDefinition = r2
            float r6 = (float) r7
            r0.constantValue = r6
            goto L69
        L4e:
            androidx.constraintlayout.core.ArrayRow r0 = r5.createRow()
            r0.createRowEquals(r6, r7)
            r5.addConstraint(r0)
            goto L69
        L59:
            androidx.constraintlayout.core.ArrayRow r0 = r5.createRow()
            r0.variable = r6
            float r7 = (float) r7
            r6.computedValue = r7
            r0.constantValue = r7
            r0.isSimpleDefinition = r2
            r5.addConstraint(r0)
        L69:
            return
    }

    public void addGreaterBarrier(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5, boolean r6) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow r6 = r2.createRow()
            androidx.constraintlayout.core.SolverVariable r0 = r2.createSlackVariable()
            r1 = 0
            r0.strength = r1
            r6.createRowGreaterThan(r3, r4, r0, r5)
            r2.addConstraint(r6)
            return
    }

    public void addGreaterThan(androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.core.ArrayRow r0 = r3.createRow()
            androidx.constraintlayout.core.SolverVariable r1 = r3.createSlackVariable()
            r2 = 0
            r1.strength = r2
            r0.createRowGreaterThan(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L20
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r0.variables
            float r4 = r4.get(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.addSingleError(r0, r4, r7)
        L20:
            r3.addConstraint(r0)
            return
    }

    public void addLowerBarrier(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5, boolean r6) {
            r2 = this;
            androidx.constraintlayout.core.ArrayRow r6 = r2.createRow()
            androidx.constraintlayout.core.SolverVariable r0 = r2.createSlackVariable()
            r1 = 0
            r0.strength = r1
            r6.createRowLowerThan(r3, r4, r0, r5)
            r2.addConstraint(r6)
            return
    }

    public void addLowerThan(androidx.constraintlayout.core.SolverVariable r4, androidx.constraintlayout.core.SolverVariable r5, int r6, int r7) {
            r3 = this;
            androidx.constraintlayout.core.ArrayRow r0 = r3.createRow()
            androidx.constraintlayout.core.SolverVariable r1 = r3.createSlackVariable()
            r2 = 0
            r1.strength = r2
            r0.createRowLowerThan(r4, r5, r1, r6)
            r4 = 8
            if (r7 == r4) goto L20
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r4 = r0.variables
            float r4 = r4.get(r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.addSingleError(r0, r4, r7)
        L20:
            r3.addConstraint(r0)
            return
    }

    public void addRatio(androidx.constraintlayout.core.SolverVariable r8, androidx.constraintlayout.core.SolverVariable r9, androidx.constraintlayout.core.SolverVariable r10, androidx.constraintlayout.core.SolverVariable r11, float r12, int r13) {
            r7 = this;
            androidx.constraintlayout.core.ArrayRow r6 = r7.createRow()
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.createRowDimensionRatio(r1, r2, r3, r4, r5)
            r8 = 8
            if (r13 == r8) goto L14
            r6.addError(r7, r13)
        L14:
            r7.addConstraint(r6)
            return
    }

    public final void addSingleError(androidx.constraintlayout.core.ArrayRow r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.constraintlayout.core.SolverVariable r4 = r1.createErrorVariable(r4, r0)
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r2 = r2.variables
            float r3 = (float) r3
            r2.put(r4, r3)
            return
    }

    public void addSynonym(androidx.constraintlayout.core.SolverVariable r3, androidx.constraintlayout.core.SolverVariable r4, int r5) {
            r2 = this;
            int r0 = r3.definitionId
            r1 = -1
            if (r0 != r1) goto L25
            if (r5 != 0) goto L25
            boolean r5 = r4.isSynonym
            if (r5 == 0) goto L13
            androidx.constraintlayout.core.Cache r5 = r2.mCache
            androidx.constraintlayout.core.SolverVariable[] r5 = r5.mIndexedVariables
            int r4 = r4.synonym
            r4 = r5[r4]
        L13:
            boolean r5 = r3.isSynonym
            if (r5 == 0) goto L20
            androidx.constraintlayout.core.Cache r4 = r2.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            int r3 = r3.synonym
            r3 = r4[r3]
            goto L2a
        L20:
            r5 = 0
            r3.setSynonym(r2, r4, r5)
            goto L2a
        L25:
            r0 = 8
            r2.addEquality(r3, r4, r5, r0)
        L2a:
            return
    }

    public androidx.constraintlayout.core.SolverVariable createErrorVariable(int r6, java.lang.String r7) {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.errors
            r3 = 1
            long r1 = r1 + r3
            r0.errors = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.ERROR
            androidx.constraintlayout.core.SolverVariable r7 = r5.acquireSolverVariable(r0, r7)
            int r0 = r5.mVariablesID
            int r0 = r0 + 1
            r5.mVariablesID = r0
            int r1 = r5.mNumColumns
            int r1 = r1 + 1
            r5.mNumColumns = r1
            r7.id = r0
            r7.strength = r6
            androidx.constraintlayout.core.Cache r6 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r6 = r6.mIndexedVariables
            r6[r0] = r7
            androidx.constraintlayout.core.LinearSystem$Row r6 = r5.mGoal
            r6.addError(r7)
            return r7
    }

    public androidx.constraintlayout.core.SolverVariable createExtraVariable() {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.extravariables
            r3 = 1
            long r1 = r1 + r3
            r0.extravariables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            r1 = 0
            androidx.constraintlayout.core.SolverVariable r0 = r5.acquireSolverVariable(r0, r1)
            int r1 = r5.mVariablesID
            int r1 = r1 + 1
            r5.mVariablesID = r1
            int r2 = r5.mNumColumns
            int r2 = r2 + 1
            r5.mNumColumns = r2
            r0.id = r1
            androidx.constraintlayout.core.Cache r2 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r2 = r2.mIndexedVariables
            r2[r1] = r0
            return r0
    }

    public androidx.constraintlayout.core.SolverVariable createObjectVariable(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.mNumColumns
            int r1 = r1 + 1
            int r2 = r3.mMaxColumns
            if (r1 < r2) goto Lf
            r3.increaseTableSize()
        Lf:
            boolean r1 = r4 instanceof androidx.constraintlayout.core.widgets.ConstraintAnchor
            if (r1 == 0) goto L53
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r4
            androidx.constraintlayout.core.SolverVariable r0 = r4.getSolverVariable()
            if (r0 != 0) goto L25
            androidx.constraintlayout.core.Cache r0 = r3.mCache
            r4.resetSolverVariable(r0)
            androidx.constraintlayout.core.SolverVariable r4 = r4.getSolverVariable()
            r0 = r4
        L25:
            int r4 = r0.id
            r1 = -1
            if (r4 == r1) goto L36
            int r2 = r3.mVariablesID
            if (r4 > r2) goto L36
            androidx.constraintlayout.core.Cache r2 = r3.mCache
            androidx.constraintlayout.core.SolverVariable[] r2 = r2.mIndexedVariables
            r2 = r2[r4]
            if (r2 != 0) goto L53
        L36:
            if (r4 == r1) goto L3b
            r0.reset()
        L3b:
            int r4 = r3.mVariablesID
            int r4 = r4 + 1
            r3.mVariablesID = r4
            int r1 = r3.mNumColumns
            int r1 = r1 + 1
            r3.mNumColumns = r1
            r0.id = r4
            androidx.constraintlayout.core.SolverVariable$Type r1 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            r0.mType = r1
            androidx.constraintlayout.core.Cache r1 = r3.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r1[r4] = r0
        L53:
            return r0
    }

    public androidx.constraintlayout.core.ArrayRow createRow() {
            r5 = this;
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            r1 = 1
            if (r0 == 0) goto L23
            androidx.constraintlayout.core.Cache r0 = r5.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.core.ArrayRow r0 = (androidx.constraintlayout.core.ArrayRow) r0
            if (r0 != 0) goto L1f
            androidx.constraintlayout.core.LinearSystem$ValuesRow r0 = new androidx.constraintlayout.core.LinearSystem$ValuesRow
            androidx.constraintlayout.core.Cache r3 = r5.mCache
            r0.<init>(r5, r3)
            long r3 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION
            long r3 = r3 + r1
            androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ARRAY_ROW_CREATION = r3
            goto L3f
        L1f:
            r0.reset()
            goto L3f
        L23:
            androidx.constraintlayout.core.Cache r0 = r5.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            java.lang.Object r0 = r0.acquire()
            androidx.constraintlayout.core.ArrayRow r0 = (androidx.constraintlayout.core.ArrayRow) r0
            if (r0 != 0) goto L3c
            androidx.constraintlayout.core.ArrayRow r0 = new androidx.constraintlayout.core.ArrayRow
            androidx.constraintlayout.core.Cache r3 = r5.mCache
            r0.<init>(r3)
            long r3 = androidx.constraintlayout.core.LinearSystem.ARRAY_ROW_CREATION
            long r3 = r3 + r1
            androidx.constraintlayout.core.LinearSystem.ARRAY_ROW_CREATION = r3
            goto L3f
        L3c:
            r0.reset()
        L3f:
            androidx.constraintlayout.core.SolverVariable.increaseErrorId()
            return r0
    }

    public androidx.constraintlayout.core.SolverVariable createSlackVariable() {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto Lb
            long r1 = r0.slackvariables
            r3 = 1
            long r1 = r1 + r3
            r0.slackvariables = r1
        Lb:
            int r0 = r5.mNumColumns
            int r0 = r0 + 1
            int r1 = r5.mMaxColumns
            if (r0 < r1) goto L16
            r5.increaseTableSize()
        L16:
            androidx.constraintlayout.core.SolverVariable$Type r0 = androidx.constraintlayout.core.SolverVariable.Type.SLACK
            r1 = 0
            androidx.constraintlayout.core.SolverVariable r0 = r5.acquireSolverVariable(r0, r1)
            int r1 = r5.mVariablesID
            int r1 = r1 + 1
            r5.mVariablesID = r1
            int r2 = r5.mNumColumns
            int r2 = r2 + 1
            r5.mNumColumns = r2
            r0.id = r1
            androidx.constraintlayout.core.Cache r2 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r2 = r2.mIndexedVariables
            r2[r1] = r0
            return r0
    }

    public void displayReadableRows() {
            r9 = this;
            r9.displaySolverVariables()
            java.lang.String r0 = " num vars "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r9.mVariablesID
            java.lang.String r2 = "\n"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            r1 = 0
            r3 = 0
        L13:
            int r4 = r9.mVariablesID
            int r4 = r4 + 1
            java.lang.String r5 = " = "
            java.lang.String r6 = "] => "
            if (r3 >= r4) goto L51
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            r4 = r4[r3]
            if (r4 == 0) goto L4e
            boolean r7 = r4.isFinalValue
            if (r7 == 0) goto L4e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = " $["
            r7.append(r0)
            r7.append(r3)
            r7.append(r6)
            r7.append(r4)
            r7.append(r5)
            float r0 = r4.computedValue
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = r7.toString()
        L4e:
            int r3 = r3 + 1
            goto L13
        L51:
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r2)
            r3 = 0
        L56:
            int r4 = r9.mVariablesID
            int r4 = r4 + 1
            if (r3 >= r4) goto L9c
            androidx.constraintlayout.core.Cache r4 = r9.mCache
            androidx.constraintlayout.core.SolverVariable[] r4 = r4.mIndexedVariables
            r7 = r4[r3]
            if (r7 == 0) goto L99
            boolean r8 = r7.isSynonym
            if (r8 == 0) goto L99
            int r8 = r7.synonym
            r4 = r4[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r0 = " ~["
            r8.append(r0)
            r8.append(r3)
            r8.append(r6)
            r8.append(r7)
            r8.append(r5)
            r8.append(r4)
            java.lang.String r0 = " + "
            r8.append(r0)
            float r0 = r7.synonymDelta
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = r8.toString()
        L99:
            int r3 = r3 + 1
            goto L56
        L9c:
            java.lang.String r3 = "\n\n #  "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
        La2:
            int r3 = r9.mNumRows
            if (r1 >= r3) goto Lc2
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.ArrayRow[] r3 = r9.mRows
            r3 = r3[r1]
            java.lang.String r3 = r3.toReadableString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "\n #  "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
            int r1 = r1 + 1
            goto La2
        Lc2:
            androidx.constraintlayout.core.LinearSystem$Row r1 = r9.mGoal
            if (r1 == 0) goto Ld8
            java.lang.String r1 = "Goal: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m24m(r0, r1)
            androidx.constraintlayout.core.LinearSystem$Row r1 = r9.mGoal
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        Ld8:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    public void displayVariablesReadableRows() {
            r5 = this;
            r5.displaySolverVariables()
            java.lang.String r0 = ""
            r1 = 0
        L6:
            int r2 = r5.mNumRows
            java.lang.String r3 = "\n"
            if (r1 >= r2) goto L32
            androidx.constraintlayout.core.ArrayRow[] r2 = r5.mRows
            r2 = r2[r1]
            androidx.constraintlayout.core.SolverVariable r2 = r2.variable
            androidx.constraintlayout.core.SolverVariable$Type r2 = r2.mType
            androidx.constraintlayout.core.SolverVariable$Type r4 = androidx.constraintlayout.core.SolverVariable.Type.UNRESTRICTED
            if (r2 != r4) goto L2f
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.ArrayRow[] r2 = r5.mRows
            r2 = r2[r1]
            java.lang.String r2 = r2.toReadableString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3)
        L2f:
            int r1 = r1 + 1
            goto L6
        L32:
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            androidx.constraintlayout.core.LinearSystem$Row r1 = r5.mGoal
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return
    }

    public void fillMetrics(androidx.constraintlayout.core.Metrics r1) {
            r0 = this;
            androidx.constraintlayout.core.LinearSystem.sMetrics = r1
            return
    }

    public androidx.constraintlayout.core.Cache getCache() {
            r1 = this;
            androidx.constraintlayout.core.Cache r0 = r1.mCache
            return r0
    }

    public int getMemoryUsed() {
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.mNumRows
            if (r1 >= r3) goto L24
            androidx.constraintlayout.core.ArrayRow[] r3 = r6.mRows
            r4 = r3[r1]
            if (r4 == 0) goto L21
            r3 = r3[r1]
            androidx.constraintlayout.core.SolverVariable r4 = r3.variable
            r5 = 4
            if (r4 == 0) goto L16
            r4 = 4
            goto L17
        L16:
            r4 = 0
        L17:
            int r4 = r4 + r5
            int r4 = r4 + r5
            androidx.constraintlayout.core.ArrayRow$ArrayRowVariables r3 = r3.variables
            int r3 = r3.sizeInBytes()
            int r3 = r3 + r4
            int r2 = r2 + r3
        L21:
            int r1 = r1 + 1
            goto L3
        L24:
            return r2
    }

    public int getNumEquations() {
            r1 = this;
            int r0 = r1.mNumRows
            return r0
    }

    public int getNumVariables() {
            r1 = this;
            int r0 = r1.mVariablesID
            return r0
    }

    public int getObjectVariableValue(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            androidx.constraintlayout.core.SolverVariable r2 = r2.getSolverVariable()
            if (r2 == 0) goto Lf
            float r2 = r2.computedValue
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public void minimize() throws java.lang.Exception {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r1 = 1
            if (r0 == 0) goto Lb
            long r3 = r0.minimize
            long r3 = r3 + r1
            r0.minimize = r3
        Lb:
            androidx.constraintlayout.core.LinearSystem$Row r0 = r5.mGoal
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L17
            r5.computeValues()
            return
        L17:
            boolean r0 = r5.graphOptimizer
            if (r0 != 0) goto L26
            boolean r0 = r5.newgraphOptimizer
            if (r0 == 0) goto L20
            goto L26
        L20:
            androidx.constraintlayout.core.LinearSystem$Row r0 = r5.mGoal
            r5.minimizeGoal(r0)
            goto L56
        L26:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L2f
            long r3 = r0.graphOptimizer
            long r3 = r3 + r1
            r0.graphOptimizer = r3
        L2f:
            r0 = 0
            r3 = 0
        L31:
            int r4 = r5.mNumRows
            if (r3 >= r4) goto L41
            androidx.constraintlayout.core.ArrayRow[] r4 = r5.mRows
            r4 = r4[r3]
            boolean r4 = r4.isSimpleDefinition
            if (r4 != 0) goto L3e
            goto L42
        L3e:
            int r3 = r3 + 1
            goto L31
        L41:
            r0 = 1
        L42:
            if (r0 != 0) goto L4a
            androidx.constraintlayout.core.LinearSystem$Row r0 = r5.mGoal
            r5.minimizeGoal(r0)
            goto L56
        L4a:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L53
            long r3 = r0.fullySolved
            long r3 = r3 + r1
            r0.fullySolved = r3
        L53:
            r5.computeValues()
        L56:
            return
    }

    public final void minimizeGoal(androidx.constraintlayout.core.LinearSystem.Row r6) throws java.lang.Exception {
            r5 = this;
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            if (r0 == 0) goto L23
            long r1 = r0.minimizeGoal
            r3 = 1
            long r1 = r1 + r3
            r0.minimizeGoal = r1
            long r1 = r0.maxVariables
            int r3 = r5.mNumColumns
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxVariables = r1
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            long r1 = r0.maxRows
            int r3 = r5.mNumRows
            long r3 = (long) r3
            long r1 = java.lang.Math.max(r1, r3)
            r0.maxRows = r1
        L23:
            r5.enforceBFS(r6)
            r0 = 0
            r5.optimize(r6, r0)
            r5.computeValues()
            return
    }

    public void removeRow(androidx.constraintlayout.core.ArrayRow r7) {
            r6 = this;
            boolean r0 = r7.isSimpleDefinition
            if (r0 == 0) goto L46
            androidx.constraintlayout.core.SolverVariable r0 = r7.variable
            if (r0 == 0) goto L46
            int r0 = r0.definitionId
            r1 = -1
            if (r0 == r1) goto L28
        Ld:
            int r2 = r6.mNumRows
            int r2 = r2 + r1
            if (r0 >= r2) goto L26
            androidx.constraintlayout.core.ArrayRow[] r2 = r6.mRows
            int r3 = r0 + 1
            r4 = r2[r3]
            androidx.constraintlayout.core.SolverVariable r4 = r4.variable
            int r5 = r4.definitionId
            if (r5 != r3) goto L20
            r4.definitionId = r0
        L20:
            r4 = r2[r3]
            r2[r0] = r4
            r0 = r3
            goto Ld
        L26:
            r6.mNumRows = r2
        L28:
            androidx.constraintlayout.core.SolverVariable r0 = r7.variable
            boolean r1 = r0.isFinalValue
            if (r1 != 0) goto L33
            float r1 = r7.constantValue
            r0.setFinalValue(r6, r1)
        L33:
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L3f
            androidx.constraintlayout.core.Cache r0 = r6.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.optimizedArrayRowPool
            r0.release(r7)
            goto L46
        L3f:
            androidx.constraintlayout.core.Cache r0 = r6.mCache
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.ArrayRow> r0 = r0.arrayRowPool
            r0.release(r7)
        L46:
            return
    }

    public void reset() {
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            androidx.constraintlayout.core.Cache r2 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r3 = r2.mIndexedVariables
            int r4 = r3.length
            if (r1 >= r4) goto L13
            r2 = r3[r1]
            if (r2 == 0) goto L10
            r2.reset()
        L10:
            int r1 = r1 + 1
            goto L2
        L13:
            androidx.constraintlayout.core.Pools$Pool<androidx.constraintlayout.core.SolverVariable> r1 = r2.solverVariablePool
            androidx.constraintlayout.core.SolverVariable[] r2 = r5.mPoolVariables
            int r3 = r5.mPoolVariablesCount
            r1.releaseAll(r2, r3)
            r5.mPoolVariablesCount = r0
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            androidx.constraintlayout.core.SolverVariable[] r1 = r1.mIndexedVariables
            r2 = 0
            java.util.Arrays.fill(r1, r2)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.SolverVariable> r1 = r5.mVariables
            if (r1 == 0) goto L2d
            r1.clear()
        L2d:
            r5.mVariablesID = r0
            androidx.constraintlayout.core.LinearSystem$Row r1 = r5.mGoal
            r1.clear()
            r1 = 1
            r5.mNumColumns = r1
            r1 = 0
        L38:
            int r2 = r5.mNumRows
            if (r1 >= r2) goto L4a
            androidx.constraintlayout.core.ArrayRow[] r2 = r5.mRows
            r3 = r2[r1]
            if (r3 == 0) goto L47
            r2 = r2[r1]
            java.util.Objects.requireNonNull(r2)
        L47:
            int r1 = r1 + 1
            goto L38
        L4a:
            r5.releaseRows()
            r5.mNumRows = r0
            boolean r0 = androidx.constraintlayout.core.LinearSystem.OPTIMIZED_ENGINE
            if (r0 == 0) goto L5d
            androidx.constraintlayout.core.LinearSystem$ValuesRow r0 = new androidx.constraintlayout.core.LinearSystem$ValuesRow
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            r0.<init>(r5, r1)
            r5.mTempGoal = r0
            goto L66
        L5d:
            androidx.constraintlayout.core.ArrayRow r0 = new androidx.constraintlayout.core.ArrayRow
            androidx.constraintlayout.core.Cache r1 = r5.mCache
            r0.<init>(r1)
            r5.mTempGoal = r0
        L66:
            return
    }
}
