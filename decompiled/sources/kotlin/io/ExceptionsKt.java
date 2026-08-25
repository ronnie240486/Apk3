package kotlin.io;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, d2 = {"constructMessage", "", "file", "Ljava/io/File;", "other", "reason", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ExceptionsKt {
    public static final /* synthetic */ java.lang.String access$constructMessage(java.io.File r0, java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = constructMessage(r0, r1, r2)
            return r0
    }

    private static final java.lang.String constructMessage(java.io.File r2, java.io.File r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            if (r3 == 0) goto L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = " -> "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L1f:
            if (r4 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
        L35:
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }
}
