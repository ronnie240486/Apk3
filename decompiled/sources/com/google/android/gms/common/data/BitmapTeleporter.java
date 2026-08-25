package com.google.android.gms.common.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.BitmapTeleporter> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    public final int zaa;

    @androidx.annotation.Nullable
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public android.os.ParcelFileDescriptor zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public final int zac;

    @androidx.annotation.Nullable
    private android.graphics.Bitmap zad;
    private boolean zae;
    private java.io.File zaf;

    static {
            com.google.android.gms.common.data.zaa r0 = new com.google.android.gms.common.data.zaa
            r0.<init>()
            com.google.android.gms.common.data.BitmapTeleporter.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public BitmapTeleporter(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) android.os.ParcelFileDescriptor r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r1 = 0
            r0.zad = r1
            r1 = 0
            r0.zae = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public BitmapTeleporter(@androidx.annotation.NonNull android.graphics.Bitmap r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.zaa = r0
            r1 = 0
            r2.zab = r1
            r1 = 0
            r2.zac = r1
            r2.zad = r3
            r2.zae = r0
            return
    }

    private static final void zaa(java.io.Closeable r2) {
            r2.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = "BitmapTeleporter"
            java.lang.String r1 = "Could not close stream"
            android.util.Log.w(r0, r1, r2)
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.graphics.Bitmap get() {
            r5 = this;
            boolean r0 = r5.zae
            if (r0 != 0) goto L52
            java.io.DataInputStream r0 = new java.io.DataInputStream
            android.os.ParcelFileDescriptor$AutoCloseInputStream r1 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            android.os.ParcelFileDescriptor r2 = r5.zab
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            java.lang.String r4 = r0.readUTF()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.valueOf(r4)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            r0.read(r1)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            zaa(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            r1.copyPixelsFromBuffer(r0)
            r5.zad = r1
            r0 = 1
            r5.zae = r0
            goto L52
        L43:
            r1 = move-exception
            goto L4e
        L45:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "Could not read from parcel file descriptor"
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L43
            throw r2     // Catch: java.lang.Throwable -> L43
        L4e:
            zaa(r0)
            throw r1
        L52:
            android.graphics.Bitmap r0 = r5.zad
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void release() {
            r3 = this;
            boolean r0 = r3.zae
            if (r0 != 0) goto L18
            android.os.ParcelFileDescriptor r0 = r3.zab     // Catch: java.io.IOException -> L10
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.io.IOException -> L10
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch: java.io.IOException -> L10
            r0.close()     // Catch: java.io.IOException -> L10
            return
        L10:
            r0 = move-exception
            java.lang.String r1 = "BitmapTeleporter"
            java.lang.String r2 = "Could not close PFD"
            android.util.Log.w(r1, r2, r0)
        L18:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setTempDir(@androidx.annotation.NonNull java.io.File r2) {
            r1 = this;
            java.lang.String r0 = "Cannot set null temp directory"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zaf = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r7, int r8) {
            r6 = this;
            android.os.ParcelFileDescriptor r0 = r6.zab
            if (r0 != 0) goto L95
            android.graphics.Bitmap r0 = r6.zad
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r1 = r0.getRowBytes()
            int r2 = r0.getHeight()
            int r2 = r2 * r1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r0.copyPixelsToBuffer(r1)
            byte[] r1 = r1.array()
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            java.io.File r3 = r6.zaf
            if (r3 == 0) goto L8c
            java.lang.String r4 = "teleporter"
            java.lang.String r5 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch: java.io.IOException -> L83
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L7b
            r4.<init>(r3)     // Catch: java.io.FileNotFoundException -> L7b
            r5 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r3, r5)     // Catch: java.io.FileNotFoundException -> L7b
            r6.zab = r5     // Catch: java.io.FileNotFoundException -> L7b
            r3.delete()
            r2.<init>(r4)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r2)
            int r2 = r1.length     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            int r2 = r0.getWidth()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            android.graphics.Bitmap$Config r0 = r0.getConfig()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.writeUTF(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r3.write(r1)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            zaa(r3)
            goto L95
        L6c:
            r7 = move-exception
            goto L77
        L6e:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = "Could not write into unlinked file"
            r8.<init>(r0, r7)     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        L77:
            zaa(r3)
            throw r7
        L7b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Temporary file is somehow already deleted"
            r7.<init>(r8)
            throw r7
        L83:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not create temporary file"
            r8.<init>(r0, r7)
            throw r8
        L8c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "setTempDir() must be called before writing this object to a parcel"
            r7.<init>(r8)
            throw r7
        L95:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r7)
            int r1 = r6.zaa
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r7, r2, r1)
            r1 = 2
            android.os.ParcelFileDescriptor r3 = r6.zab
            r8 = r8 | r2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r1, r3, r8, r2)
            r8 = 3
            int r1 = r6.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r7, r8, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r7, r0)
            r7 = 0
            r6.zab = r7
            return
    }
}
