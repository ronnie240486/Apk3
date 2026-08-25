package kotlin.system;

/* JADX INFO: compiled from: Process.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, d2 = {"exitProcess", "", "status", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
@kotlin.jvm.JvmName(name = "ProcessKt")
public final class ProcessKt {
    @kotlin.internal.InlineOnly
    private static final java.lang.Void exitProcess(int r1) {
            java.lang.System.exit(r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "System.exit returned normally, while it was supposed to halt JVM."
            r1.<init>(r0)
            throw r1
    }
}
