package androidx.core.graphics;

/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u001a\u001a\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003\u001a\u001a\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u001a\u0015\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0001H\u0086\b¨\u0006\u0010"}, d2 = {"rotationMatrix", "Landroid/graphics/Matrix;", "degrees", "", "px", "py", "scaleMatrix", "sx", "sy", "translationMatrix", "tx", "ty", "times", "m", "values", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MatrixKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix rotationMatrix(float r1, float r2, float r3) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setRotate(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix rotationMatrix$default(float r1, float r2, float r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto L6
            r2 = 0
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            android.graphics.Matrix r1 = rotationMatrix(r1, r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix scaleMatrix(float r1, float r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix scaleMatrix$default(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L8
            r1 = 1065353216(0x3f800000, float:1.0)
        L8:
            r3 = r3 & 2
            if (r3 == 0) goto Le
            r2 = 1065353216(0x3f800000, float:1.0)
        Le:
            android.graphics.Matrix r1 = scaleMatrix(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix times(@org.jetbrains.annotations.NotNull android.graphics.Matrix r1, @org.jetbrains.annotations.NotNull android.graphics.Matrix r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "m"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            r0.preConcat(r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Matrix translationMatrix(float r1, float r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setTranslate(r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Matrix translationMatrix$default(float r1, float r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            r0 = 0
            if (r4 == 0) goto L6
            r1 = 0
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r2 = 0
        Lb:
            android.graphics.Matrix r1 = translationMatrix(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final float[] values(@org.jetbrains.annotations.NotNull android.graphics.Matrix r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 9
            float[] r0 = new float[r0]
            r1.getValues(r0)
            return r0
    }
}
