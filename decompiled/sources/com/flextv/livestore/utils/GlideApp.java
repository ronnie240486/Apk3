package com.flextv.livestore.utils;

/* JADX INFO: loaded from: classes.dex */
public final class GlideApp {
    private GlideApp() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"VisibleForTests"})
    @androidx.annotation.VisibleForTesting
    public static void enableHardwareBitmaps() {
            com.bumptech.glide.Glide.enableHardwareBitmaps()
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.Glide get(@androidx.annotation.NonNull android.content.Context r0) {
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.io.File getPhotoCacheDir(@androidx.annotation.NonNull android.content.Context r0) {
            java.io.File r0 = com.bumptech.glide.Glide.getPhotoCacheDir(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static java.io.File getPhotoCacheDir(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.io.File r0 = com.bumptech.glide.Glide.getPhotoCacheDir(r0, r1)
            return r0
    }

    @android.annotation.SuppressLint({"VisibleForTests"})
    @androidx.annotation.VisibleForTesting
    public static void init(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull com.bumptech.glide.GlideBuilder r1) {
            com.bumptech.glide.Glide.init(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"VisibleForTests"})
    @androidx.annotation.VisibleForTesting
    @java.lang.Deprecated
    public static void init(com.bumptech.glide.Glide r0) {
            com.bumptech.glide.Glide.init(r0)
            return
    }

    @android.annotation.SuppressLint({"VisibleForTests"})
    @androidx.annotation.VisibleForTesting
    public static void tearDown() {
            com.bumptech.glide.Glide.tearDown()
            return
    }

    @androidx.annotation.NonNull
    public static com.flextv.livestore.utils.GlideRequests with(@androidx.annotation.NonNull android.app.Activity r0) {
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.utils.GlideRequests r0 = (com.flextv.livestore.utils.GlideRequests) r0
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public static com.flextv.livestore.utils.GlideRequests with(@androidx.annotation.NonNull android.app.Fragment r0) {
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.utils.GlideRequests r0 = (com.flextv.livestore.utils.GlideRequests) r0
            return r0
    }

    @androidx.annotation.NonNull
    public static com.flextv.livestore.utils.GlideRequests with(@androidx.annotation.NonNull android.content.Context r0) {
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.utils.GlideRequests r0 = (com.flextv.livestore.utils.GlideRequests) r0
            return r0
    }

    @androidx.annotation.NonNull
    public static com.flextv.livestore.utils.GlideRequests with(@androidx.annotation.NonNull android.view.View r0) {
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.utils.GlideRequests r0 = (com.flextv.livestore.utils.GlideRequests) r0
            return r0
    }

    @androidx.annotation.NonNull
    public static com.flextv.livestore.utils.GlideRequests with(@androidx.annotation.NonNull androidx.fragment.app.Fragment r0) {
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.utils.GlideRequests r0 = (com.flextv.livestore.utils.GlideRequests) r0
            return r0
    }

    @androidx.annotation.NonNull
    public static com.flextv.livestore.utils.GlideRequests with(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r0) {
            com.bumptech.glide.RequestManager r0 = com.bumptech.glide.Glide.with(r0)
            com.flextv.livestore.utils.GlideRequests r0 = (com.flextv.livestore.utils.GlideRequests) r0
            return r0
    }
}
