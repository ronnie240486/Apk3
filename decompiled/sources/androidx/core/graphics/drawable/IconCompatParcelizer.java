package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.graphics.drawable.IconCompat read(androidx.versionedparcelable.VersionedParcel r3) {
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.mType
            r2 = 1
            int r1 = r3.readInt(r1, r2)
            r0.mType = r1
            byte[] r1 = r0.mData
            r2 = 2
            byte[] r1 = r3.readByteArray(r1, r2)
            r0.mData = r1
            android.os.Parcelable r1 = r0.mParcelable
            r2 = 3
            android.os.Parcelable r1 = r3.readParcelable(r1, r2)
            r0.mParcelable = r1
            int r1 = r0.mInt1
            r2 = 4
            int r1 = r3.readInt(r1, r2)
            r0.mInt1 = r1
            int r1 = r0.mInt2
            r2 = 5
            int r1 = r3.readInt(r1, r2)
            r0.mInt2 = r1
            android.content.res.ColorStateList r1 = r0.mTintList
            r2 = 6
            android.os.Parcelable r1 = r3.readParcelable(r1, r2)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.mTintList = r1
            java.lang.String r1 = r0.mTintModeStr
            r2 = 7
            java.lang.String r1 = r3.readString(r1, r2)
            r0.mTintModeStr = r1
            java.lang.String r1 = r0.mString1
            r2 = 8
            java.lang.String r3 = r3.readString(r1, r2)
            r0.mString1 = r3
            r0.onPostParceling()
            return r0
    }

    public static void write(androidx.core.graphics.drawable.IconCompat r3, androidx.versionedparcelable.VersionedParcel r4) {
            r0 = 1
            r4.setSerializationFlags(r0, r0)
            boolean r1 = r4.isStream()
            r3.onPreParceling(r1)
            int r1 = r3.mType
            r2 = -1
            if (r2 == r1) goto L13
            r4.writeInt(r1, r0)
        L13:
            byte[] r0 = r3.mData
            if (r0 == 0) goto L1b
            r1 = 2
            r4.writeByteArray(r0, r1)
        L1b:
            android.os.Parcelable r0 = r3.mParcelable
            if (r0 == 0) goto L23
            r1 = 3
            r4.writeParcelable(r0, r1)
        L23:
            int r0 = r3.mInt1
            if (r0 == 0) goto L2b
            r1 = 4
            r4.writeInt(r0, r1)
        L2b:
            int r0 = r3.mInt2
            if (r0 == 0) goto L33
            r1 = 5
            r4.writeInt(r0, r1)
        L33:
            android.content.res.ColorStateList r0 = r3.mTintList
            if (r0 == 0) goto L3b
            r1 = 6
            r4.writeParcelable(r0, r1)
        L3b:
            java.lang.String r0 = r3.mTintModeStr
            if (r0 == 0) goto L43
            r1 = 7
            r4.writeString(r0, r1)
        L43:
            java.lang.String r3 = r3.mString1
            if (r3 == 0) goto L4c
            r0 = 8
            r4.writeString(r3, r0)
        L4c:
            return
    }
}
