package androidx.core.database;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\n\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¨\u0006\u0015"}, d2 = {"getBlobOrNull", "", "Landroid/database/Cursor;", "index", "", "getDoubleOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "getFloatOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "getIntOrNull", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "getLongOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "getShortOrNull", "", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "getStringOrNull", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CursorKt {
    @org.jetbrains.annotations.Nullable
    public static final byte[] getBlobOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            byte[] r1 = r1.getBlob(r2)
        L11:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Double getDoubleOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            double r1 = r1.getDouble(r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
        L15:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Float getFloatOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            float r1 = r1.getFloat(r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
        L15:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer getIntOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            int r1 = r1.getInt(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L15:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long getLongOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            long r1 = r1.getLong(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L15:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Short getShortOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            short r1 = r1.getShort(r2)
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
        L15:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getStringOrNull(@org.jetbrains.annotations.NotNull android.database.Cursor r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            java.lang.String r1 = r1.getString(r2)
        L11:
            return r1
    }
}
