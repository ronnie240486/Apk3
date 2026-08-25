package androidx.core.graphics;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\f"}, d2 = {"and", "Landroid/graphics/Path;", "p", "flatten", "", "Landroidx/core/graphics/PathSegment;", "error", "", "minus", "or", "plus", "xor", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class PathKt {
    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path and(@org.jetbrains.annotations.NotNull android.graphics.Path r2, @org.jetbrains.annotations.NotNull android.graphics.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            android.graphics.Path$Op r1 = android.graphics.Path.Op.INTERSECT
            r0.op(r2, r3, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Iterable<androidx.core.graphics.PathSegment> flatten(@org.jetbrains.annotations.NotNull android.graphics.Path r1, float r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Collection r1 = androidx.core.graphics.PathUtils.flatten(r1, r2)
            java.lang.String r2 = "flatten(this, error)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ java.lang.Iterable flatten$default(android.graphics.Path r0, float r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 1056964608(0x3f000000, float:0.5)
        L6:
            java.lang.Iterable r0 = flatten(r0, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path minus(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path or(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path plus(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Path xor(@org.jetbrains.annotations.NotNull android.graphics.Path r1, @org.jetbrains.annotations.NotNull android.graphics.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>(r1)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.XOR
            r0.op(r2, r1)
            return r0
    }
}
