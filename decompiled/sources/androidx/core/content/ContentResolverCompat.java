package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentResolverCompat {

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.database.Cursor query(android.content.ContentResolver r0, android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, android.os.CancellationSignal r6) {
                android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6)
                return r0
        }
    }

    private ContentResolverCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.database.Cursor query(@androidx.annotation.NonNull android.content.ContentResolver r7, @androidx.annotation.NonNull android.net.Uri r8, @androidx.annotation.Nullable java.lang.String[] r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable java.lang.String[] r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable androidx.core.os.CancellationSignal r13) {
            if (r13 == 0) goto L9
            java.lang.Object r13 = r13.getCancellationSignalObject()     // Catch: java.lang.Exception -> L7
            goto La
        L7:
            r7 = move-exception
            goto L18
        L9:
            r13 = 0
        La:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch: java.lang.Exception -> L7
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = androidx.core.content.ContentResolverCompat.Api16Impl.query(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7
            return r7
        L18:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L22
            androidx.core.os.OperationCanceledException r7 = new androidx.core.os.OperationCanceledException
            r7.<init>()
            throw r7
        L22:
            throw r7
    }
}
