package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
final class GeneratedRequestManagerFactory implements com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory {
    public GeneratedRequestManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestManager build(@androidx.annotation.NonNull com.bumptech.glide.Glide r2, @androidx.annotation.NonNull com.bumptech.glide.manager.Lifecycle r3, @androidx.annotation.NonNull com.bumptech.glide.manager.RequestManagerTreeNode r4, @androidx.annotation.NonNull android.content.Context r5) {
            r1 = this;
            com.flextv.livestore.utils.GlideRequests r0 = new com.flextv.livestore.utils.GlideRequests
            r0.<init>(r2, r3, r4, r5)
            return r0
    }
}
