package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/CompletionHandlerBase;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "job", "Lkotlinx/coroutines/JobSupport;", "getJob", "()Lkotlinx/coroutines/JobSupport;", "setJob", "(Lkotlinx/coroutines/JobSupport;)V", "list", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "dispose", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class JobNode extends kotlinx.coroutines.CompletionHandlerBase implements kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.Incomplete {
    public kotlinx.coroutines.JobSupport job;

    public JobNode() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            r0.removeNode$kotlinx_coroutines_core(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.JobSupport getJob() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.job
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    @org.jetbrains.annotations.Nullable
    public kotlinx.coroutines.NodeList getList() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void setJob(@org.jetbrains.annotations.NotNull kotlinx.coroutines.JobSupport r1) {
            r0 = this;
            r0.job = r1
            return
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            kotlinx.coroutines.JobSupport r1 = r2.getJob()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
