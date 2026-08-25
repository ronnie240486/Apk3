package okhttp3.internal.http;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, k = 1, mv = {1, 4, 1})
public final class HttpMethod {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.HttpMethod INSTANCE = null;

    static {
            okhttp3.internal.http.HttpMethod r0 = new okhttp3.internal.http.HttpMethod
            r0.<init>()
            okhttp3.internal.http.HttpMethod.INSTANCE = r0
            return
    }

    private HttpMethod() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final boolean permitsRequestBody(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "GET"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "HEAD"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r1 != 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final boolean requiresRequestBody(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "POST"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PUT"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PATCH"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PROPPATCH"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "REPORT"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r1 == 0) goto L2e
            goto L30
        L2e:
            r1 = 0
            goto L31
        L30:
            r1 = 1
        L31:
            return r1
    }

    public final boolean invalidatesCache(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "POST"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PATCH"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "PUT"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "DELETE"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = "MOVE"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L2e
            goto L30
        L2e:
            r2 = 0
            goto L31
        L30:
            r2 = 1
        L31:
            return r2
    }

    public final boolean redirectsToGet(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "PROPFIND"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            r2 = r2 ^ 1
            return r2
    }

    public final boolean redirectsWithBody(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "PROPFIND"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            return r2
    }
}
