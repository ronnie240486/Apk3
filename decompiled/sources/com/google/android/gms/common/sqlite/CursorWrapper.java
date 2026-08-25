package com.google.android.gms.common.sqlite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public CursorWrapper(@androidx.annotation.NonNull android.database.Cursor r4) {
            r3 = this;
            r3.<init>(r4)
            r0 = 0
        L4:
            r1 = 10
            if (r0 >= r1) goto L15
            boolean r1 = r4 instanceof android.database.CursorWrapper
            if (r1 == 0) goto L15
            android.database.CursorWrapper r4 = (android.database.CursorWrapper) r4
            android.database.Cursor r4 = r4.getWrappedCursor()
            int r0 = r0 + 1
            goto L4
        L15:
            boolean r0 = r4 instanceof android.database.AbstractWindowedCursor
            if (r0 != 0) goto L39
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "Unknown type: "
            int r2 = r4.length()
            if (r2 == 0) goto L30
            java.lang.String r4 = r1.concat(r4)
            goto L35
        L30:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L35:
            r0.<init>(r4)
            throw r0
        L39:
            android.database.AbstractWindowedCursor r4 = (android.database.AbstractWindowedCursor) r4
            r3.zza = r4
            return
    }

    @Override // android.database.CrossProcessCursor
    @com.google.android.gms.common.annotation.KeepForSdk
    public void fillWindow(int r2, @androidx.annotation.NonNull android.database.CursorWindow r3) {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            r0.fillWindow(r2, r3)
            return
    }

    @Override // android.database.CrossProcessCursor
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.database.CursorWindow getWindow() {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            android.database.CursorWindow r0 = r0.getWindow()
            return r0
    }

    @Override // android.database.CursorWrapper
    @androidx.annotation.NonNull
    public final /* synthetic */ android.database.Cursor getWrappedCursor() {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            return r0
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int r2, int r3) {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            boolean r2 = r0.onMove(r2, r3)
            return r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setWindow(@androidx.annotation.Nullable android.database.CursorWindow r2) {
            r1 = this;
            android.database.AbstractWindowedCursor r0 = r1.zza
            r0.setWindow(r2)
            return
    }
}
