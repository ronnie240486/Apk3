package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskImpl;", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "submissionTime", "", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "(Ljava/lang/Runnable;JLkotlinx/coroutines/scheduling/TaskContext;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class TaskImpl extends kotlinx.coroutines.scheduling.Task {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Runnable block;

    public TaskImpl(@org.jetbrains.annotations.NotNull java.lang.Runnable r1, long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.scheduling.TaskContext r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.block = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.lang.Runnable r0 = r2.block     // Catch: java.lang.Throwable -> Lb
            r0.run()     // Catch: java.lang.Throwable -> Lb
            kotlinx.coroutines.scheduling.TaskContext r0 = r2.taskContext
            r0.afterTask()
            return
        Lb:
            r0 = move-exception
            kotlinx.coroutines.scheduling.TaskContext r1 = r2.taskContext
            r1.afterTask()
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "Task["
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Runnable r1 = r4.block
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r1)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.Runnable r1 = r4.block
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.submissionTime
            r0.append(r2)
            r0.append(r1)
            kotlinx.coroutines.scheduling.TaskContext r1 = r4.taskContext
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
