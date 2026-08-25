package androidx.media;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(21)
class MediaSessionManagerImplApi21 extends androidx.media.MediaSessionManagerImplBase {
    public MediaSessionManagerImplApi21(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r0.mContext = r1
            return
    }

    private boolean hasMediaControlPermission(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfoImpl r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = r4.getPid()
            int r4 = r4.getUid()
            java.lang.String r2 = "android.permission.MEDIA_CONTENT_CONTROL"
            int r4 = r0.checkPermission(r2, r1, r4)
            if (r4 != 0) goto L16
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            return r4
    }

    @Override // androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(@androidx.annotation.NonNull androidx.media.MediaSessionManager.RemoteUserInfoImpl r2) {
            r1 = this;
            boolean r0 = r1.hasMediaControlPermission(r2)
            if (r0 != 0) goto Lf
            boolean r2 = super.isTrustedForMediaControl(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }
}
