package androidx.media;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RequiresApi(28)
class MediaSessionManagerImplApi28 extends androidx.media.MediaSessionManagerImplApi21 {

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(28)
    public static final class RemoteUserInfoImplApi28 extends androidx.media.MediaSessionManagerImplBase.RemoteUserInfoImplBase {
        public RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo r3) {
                r2 = this;
                java.lang.String r0 = r3.getPackageName()
                int r1 = r3.getPid()
                int r3 = r3.getUid()
                r2.<init>(r0, r1, r3)
                return
        }

        public RemoteUserInfoImplApi28(java.lang.String r2, int r3, int r4) {
                r1 = this;
                r1.<init>(r2, r3, r4)
                android.media.session.MediaSessionManager$RemoteUserInfo r0 = new android.media.session.MediaSessionManager$RemoteUserInfo
                r0.<init>(r2, r3, r4)
                return
        }

        public static java.lang.String getPackageName(android.media.session.MediaSessionManager.RemoteUserInfo r0) {
                java.lang.String r0 = r0.getPackageName()
                return r0
        }
    }

    public MediaSessionManagerImplApi28(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.lang.String r0 = "media_session"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.session.MediaSessionManager r2 = (android.media.session.MediaSessionManager) r2
            return
    }

    @Override // androidx.media.MediaSessionManagerImplApi21, androidx.media.MediaSessionManagerImplBase, androidx.media.MediaSessionManager.MediaSessionManagerImpl
    public boolean isTrustedForMediaControl(androidx.media.MediaSessionManager.RemoteUserInfoImpl r1) {
            r0 = this;
            boolean r1 = super.isTrustedForMediaControl(r1)
            return r1
    }
}
