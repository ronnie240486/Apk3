package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageManager {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final java.lang.Object zaa = null;
    private static java.util.HashSet<android.net.Uri> zab;
    private static com.google.android.gms.common.images.ImageManager zac;
    private final android.content.Context zad;
    private final android.os.Handler zae;
    private final java.util.concurrent.ExecutorService zaf;
    private final com.google.android.gms.internal.base.zak zag;
    private final java.util.Map<com.google.android.gms.common.images.zag, com.google.android.gms.common.images.ImageManager.ImageReceiver> zah;
    private final java.util.Map<android.net.Uri, com.google.android.gms.common.images.ImageManager.ImageReceiver> zai;
    private final java.util.Map<android.net.Uri, java.lang.Long> zaj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepName
    public final class ImageReceiver extends android.os.ResultReceiver {
        public final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
        private final android.net.Uri zab;
        private final java.util.ArrayList<com.google.android.gms.common.images.zag> zac;

        public ImageReceiver(com.google.android.gms.common.images.ImageManager r2, android.net.Uri r3) {
                r1 = this;
                r1.zaa = r2
                com.google.android.gms.internal.base.zaq r2 = new com.google.android.gms.internal.base.zaq
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0)
                r1.<init>(r2)
                r1.zab = r3
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.zac = r2
                return
        }

        public static /* bridge */ /* synthetic */ java.util.ArrayList zaa(com.google.android.gms.common.images.ImageManager.ImageReceiver r0) {
                java.util.ArrayList<com.google.android.gms.common.images.zag> r0 = r0.zac
                return r0
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int r4, android.os.Bundle r5) {
                r3 = this;
                java.lang.String r4 = "com.google.android.gms.extra.fileDescriptor"
                android.os.Parcelable r4 = r5.getParcelable(r4)
                android.os.ParcelFileDescriptor r4 = (android.os.ParcelFileDescriptor) r4
                com.google.android.gms.common.images.ImageManager r5 = r3.zaa
                java.util.concurrent.ExecutorService r0 = com.google.android.gms.common.images.ImageManager.zai(r5)
                com.google.android.gms.common.images.zaa r1 = new com.google.android.gms.common.images.zaa
                android.net.Uri r2 = r3.zab
                r1.<init>(r5, r2, r4)
                r0.execute(r1)
                return
        }

        public final void zab(com.google.android.gms.common.images.zag r2) {
                r1 = this;
                java.lang.String r0 = "ImageReceiver.addImageRequest() must be called in the main thread"
                com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
                java.util.ArrayList<com.google.android.gms.common.images.zag> r0 = r1.zac
                r0.add(r2)
                return
        }

        public final void zac(com.google.android.gms.common.images.zag r2) {
                r1 = this;
                java.lang.String r0 = "ImageReceiver.removeImageRequest() must be called in the main thread"
                com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
                java.util.ArrayList<com.google.android.gms.common.images.zag> r0 = r1.zac
                r0.remove(r2)
                return
        }

        public final void zad() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "com.google.android.gms.common.images.LOAD_IMAGE"
                r0.<init>(r1)
                java.lang.String r1 = "com.google.android.gms"
                r0.setPackage(r1)
                android.net.Uri r1 = r3.zab
                java.lang.String r2 = "com.google.android.gms.extras.uri"
                r0.putExtra(r2, r1)
                java.lang.String r1 = "com.google.android.gms.extras.resultReceiver"
                r0.putExtra(r1, r3)
                java.lang.String r1 = "com.google.android.gms.extras.priority"
                r2 = 3
                r0.putExtra(r1, r2)
                com.google.android.gms.common.images.ImageManager r1 = r3.zaa
                android.content.Context r1 = com.google.android.gms.common.images.ImageManager.zaa(r1)
                r1.sendBroadcast(r0)
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    public interface OnImageLoadedListener {
        void onImageLoaded(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.Nullable android.graphics.drawable.Drawable r2, boolean r3);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.images.ImageManager.zaa = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.gms.common.images.ImageManager.zab = r0
            return
    }

    private ImageManager(android.content.Context r2, boolean r3) {
            r1 = this;
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.zad = r2
            com.google.android.gms.internal.base.zaq r2 = new com.google.android.gms.internal.base.zaq
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r1.zae = r2
            com.google.android.gms.internal.base.zam r2 = com.google.android.gms.internal.base.zap.zaa()
            r3 = 4
            r0 = 2
            java.util.concurrent.ExecutorService r2 = r2.zab(r3, r0)
            r1.zaf = r2
            com.google.android.gms.internal.base.zak r2 = new com.google.android.gms.internal.base.zak
            r2.<init>()
            r1.zag = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.zah = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.zai = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.zaj = r2
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.gms.common.images.ImageManager create(@androidx.annotation.NonNull android.content.Context r2) {
            com.google.android.gms.common.images.ImageManager r0 = com.google.android.gms.common.images.ImageManager.zac
            if (r0 != 0) goto Lc
            com.google.android.gms.common.images.ImageManager r0 = new com.google.android.gms.common.images.ImageManager
            r1 = 0
            r0.<init>(r2, r1)
            com.google.android.gms.common.images.ImageManager.zac = r0
        Lc:
            com.google.android.gms.common.images.ImageManager r2 = com.google.android.gms.common.images.ImageManager.zac
            return r2
    }

    public static /* bridge */ /* synthetic */ android.content.Context zaa(com.google.android.gms.common.images.ImageManager r0) {
            android.content.Context r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zab(com.google.android.gms.common.images.ImageManager r0) {
            android.os.Handler r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zad() {
            java.lang.Object r0 = com.google.android.gms.common.images.ImageManager.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.HashSet zae() {
            java.util.HashSet<android.net.Uri> r0 = com.google.android.gms.common.images.ImageManager.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zaf(com.google.android.gms.common.images.ImageManager r0) {
            java.util.Map<android.net.Uri, java.lang.Long> r0 = r0.zaj
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zag(com.google.android.gms.common.images.ImageManager r0) {
            java.util.Map<com.google.android.gms.common.images.zag, com.google.android.gms.common.images.ImageManager$ImageReceiver> r0 = r0.zah
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zah(com.google.android.gms.common.images.ImageManager r0) {
            java.util.Map<android.net.Uri, com.google.android.gms.common.images.ImageManager$ImageReceiver> r0 = r0.zai
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService zai(com.google.android.gms.common.images.ImageManager r0) {
            java.util.concurrent.ExecutorService r0 = r0.zaf
            return r0
    }

    public void loadImage(@androidx.annotation.NonNull android.widget.ImageView r2, int r3) {
            r1 = this;
            com.google.android.gms.common.images.zae r0 = new com.google.android.gms.common.images.zae
            r0.<init>(r2, r3)
            r1.zaj(r0)
            return
    }

    public void loadImage(@androidx.annotation.NonNull android.widget.ImageView r2, @androidx.annotation.NonNull android.net.Uri r3) {
            r1 = this;
            com.google.android.gms.common.images.zae r0 = new com.google.android.gms.common.images.zae
            r0.<init>(r2, r3)
            r1.zaj(r0)
            return
    }

    public void loadImage(@androidx.annotation.NonNull android.widget.ImageView r2, @androidx.annotation.NonNull android.net.Uri r3, int r4) {
            r1 = this;
            com.google.android.gms.common.images.zae r0 = new com.google.android.gms.common.images.zae
            r0.<init>(r2, r3)
            r0.zab = r4
            r1.zaj(r0)
            return
    }

    public void loadImage(@androidx.annotation.NonNull com.google.android.gms.common.images.ImageManager.OnImageLoadedListener r2, @androidx.annotation.NonNull android.net.Uri r3) {
            r1 = this;
            com.google.android.gms.common.images.zaf r0 = new com.google.android.gms.common.images.zaf
            r0.<init>(r2, r3)
            r1.zaj(r0)
            return
    }

    public void loadImage(@androidx.annotation.NonNull com.google.android.gms.common.images.ImageManager.OnImageLoadedListener r2, @androidx.annotation.NonNull android.net.Uri r3, int r4) {
            r1 = this;
            com.google.android.gms.common.images.zaf r0 = new com.google.android.gms.common.images.zaf
            r0.<init>(r2, r3)
            r0.zab = r4
            r1.zaj(r0)
            return
    }

    public final void zaj(com.google.android.gms.common.images.zag r2) {
            r1 = this;
            java.lang.String r0 = "ImageManager.loadImage() must be called in the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            com.google.android.gms.common.images.zab r0 = new com.google.android.gms.common.images.zab
            r0.<init>(r1, r2)
            r0.run()
            return
    }
}
