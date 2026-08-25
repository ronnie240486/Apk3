package androidx.constraintlayout.core;

/* JADX INFO: loaded from: classes.dex */
public class Cache {
    public androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.ArrayRow> arrayRowPool;
    public androidx.constraintlayout.core.SolverVariable[] mIndexedVariables;
    public androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.ArrayRow> optimizedArrayRowPool;
    public androidx.constraintlayout.core.Pools.Pool<androidx.constraintlayout.core.SolverVariable> solverVariablePool;

    public Cache() {
            r1 = this;
            r1.<init>()
            androidx.constraintlayout.core.Pools$SimplePool r0 = new androidx.constraintlayout.core.Pools$SimplePool
            r0.<init>()
            r1.optimizedArrayRowPool = r0
            androidx.constraintlayout.core.Pools$SimplePool r0 = new androidx.constraintlayout.core.Pools$SimplePool
            r0.<init>()
            r1.arrayRowPool = r0
            androidx.constraintlayout.core.Pools$SimplePool r0 = new androidx.constraintlayout.core.Pools$SimplePool
            r0.<init>()
            r1.solverVariablePool = r0
            r0 = 32
            androidx.constraintlayout.core.SolverVariable[] r0 = new androidx.constraintlayout.core.SolverVariable[r0]
            r1.mIndexedVariables = r0
            return
    }
}
