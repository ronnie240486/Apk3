package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceDrawableDecoder implements com.bumptech.glide.load.ResourceDecoder<android.net.Uri, android.graphics.drawable.Drawable> {
    private static final java.lang.String ANDROID_PACKAGE_NAME = "android";
    private static final int ID_PATH_SEGMENTS = 1;
    private static final int MISSING_RESOURCE_ID = 0;
    private static final int NAME_PATH_SEGMENT_INDEX = 1;
    private static final int NAME_URI_PATH_SEGMENTS = 2;
    private static final int RESOURCE_ID_SEGMENT_INDEX = 0;
    private static final int TYPE_PATH_SEGMENT_INDEX = 0;
    private final android.content.Context context;

    public ResourceDrawableDecoder(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.context = r1
            return
    }

    @androidx.annotation.NonNull
    private android.content.Context findContextForPackage(android.net.Uri r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r3.context
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lf
            android.content.Context r4 = r3.context
            return r4
        Lf:
            android.content.Context r0 = r3.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            r1 = 0
            android.content.Context r4 = r0.createPackageContext(r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            return r4
        L17:
            r0 = move-exception
            android.content.Context r1 = r3.context
            java.lang.String r1 = r1.getPackageName()
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L27
            android.content.Context r4 = r3.context
            return r4
        L27:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to obtain context or unrecognized Uri format for: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4, r0)
            throw r5
    }

    @androidx.annotation.DrawableRes
    private int findResourceIdFromResourceIdUri(android.net.Uri r5) {
            r4 = this;
            java.util.List r0 = r5.getPathSegments()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L10
            int r5 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L10
            return r5
        L10:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unrecognized Uri format: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    @androidx.annotation.DrawableRes
    private int findResourceIdFromTypeAndNameResourceUri(android.content.Context r5, android.net.Uri r6) {
            r4 = this;
            java.util.List r0 = r6.getPathSegments()
            java.lang.String r1 = r6.getAuthority()
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 1
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getIdentifier(r0, r2, r1)
            if (r5 != 0) goto L2a
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android"
            int r5 = r5.getIdentifier(r0, r2, r1)
        L2a:
            if (r5 == 0) goto L2d
            return r5
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to find resource id for: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.DrawableRes
    private int findResourceIdFromUri(android.content.Context r4, android.net.Uri r5) {
            r3 = this;
            java.util.List r0 = r5.getPathSegments()
            int r1 = r0.size()
            r2 = 2
            if (r1 != r2) goto L10
            int r4 = r3.findResourceIdFromTypeAndNameResourceUri(r4, r5)
            return r4
        L10:
            int r4 = r0.size()
            r0 = 1
            if (r4 != r0) goto L1c
            int r4 = r3.findResourceIdFromResourceIdUri(r5)
            return r4
        L1c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unrecognized Uri format: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode2(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) {
            r0 = this;
            java.lang.String r2 = r1.getAuthority()
            android.content.Context r2 = r0.findContextForPackage(r1, r2)
            int r1 = r0.findResourceIdFromUri(r2, r1)
            android.content.Context r3 = r0.context
            android.graphics.drawable.Drawable r1 = com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat.getDrawable(r3, r2, r1)
            com.bumptech.glide.load.engine.Resource r1 = com.bumptech.glide.load.resource.drawable.NonOwnedDrawableResource.newInstance(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> decode(@androidx.annotation.NonNull android.net.Uri r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.Options r4) throws java.io.IOException {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            com.bumptech.glide.load.engine.Resource r1 = r0.decode2(r1, r2, r3, r4)
            return r1
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) {
            r0 = this;
            java.lang.String r1 = r1.getScheme()
            java.lang.String r2 = "android.resource"
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@androidx.annotation.NonNull android.net.Uri r1, @androidx.annotation.NonNull com.bumptech.glide.load.Options r2) throws java.io.IOException {
            r0 = this;
            android.net.Uri r1 = (android.net.Uri) r1
            boolean r1 = r0.handles2(r1, r2)
            return r1
    }
}
