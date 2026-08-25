package androidx.core.graphics;

/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0004H\u0086\b\u001a\r\u0010\u000b\u001a\u00020\u0004*\u00020\u0002H\u0086\b\u001a\r\u0010\f\u001a\u00020\u0002*\u00020\u0002H\u0086\n\u001a\r\u0010\f\u001a\u00020\u0004*\u00020\u0004H\u0086\n¨\u0006\r"}, d2 = {"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "minus", "p", "xy", "plus", "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PointKt {
    public static final float component1(@org.jetbrains.annotations.NotNull android.graphics.PointF r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            float r1 = r1.x
            return r1
    }

    public static final int component1(@org.jetbrains.annotations.NotNull android.graphics.Point r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.x
            return r1
    }

    public static final float component2(@org.jetbrains.annotations.NotNull android.graphics.PointF r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            float r1 = r1.y
            return r1
    }

    public static final int component2(@org.jetbrains.annotations.NotNull android.graphics.Point r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.y
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point minus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = -r3
            r0.offset(r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point minus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, @org.jetbrains.annotations.NotNull android.graphics.Point r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = r3.x
            int r2 = -r2
            int r3 = r3.y
            int r3 = -r3
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF minus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, float r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = -r3
            r0.offset(r2, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF minus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, @org.jetbrains.annotations.NotNull android.graphics.PointF r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = r3.x
            float r2 = -r2
            float r3 = r3.y
            float r3 = -r3
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point plus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            r0.offset(r3, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point plus(@org.jetbrains.annotations.NotNull android.graphics.Point r2, @org.jetbrains.annotations.NotNull android.graphics.Point r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = r3.x
            int r3 = r3.y
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF plus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, float r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            r0.offset(r3, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF plus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2, @org.jetbrains.annotations.NotNull android.graphics.PointF r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "p"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = r3.x
            float r3 = r3.y
            r0.offset(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point toPoint(@org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Point r0 = new android.graphics.Point
            float r1 = r2.x
            int r1 = (int) r1
            float r2 = r2.y
            int r2 = (int) r2
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF toPointF(@org.jetbrains.annotations.NotNull android.graphics.Point r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point unaryMinus(@org.jetbrains.annotations.NotNull android.graphics.Point r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r1 = -r1
            int r2 = r2.y
            int r2 = -r2
            r0.<init>(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.PointF unaryMinus(@org.jetbrains.annotations.NotNull android.graphics.PointF r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = -r1
            float r2 = r2.y
            float r2 = -r2
            r0.<init>(r1, r2)
            return r0
    }
}
