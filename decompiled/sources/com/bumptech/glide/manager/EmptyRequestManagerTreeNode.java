package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes2.dex */
final class EmptyRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
    public EmptyRequestManagerTreeNode() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.manager.RequestManagerTreeNode
    @androidx.annotation.NonNull
    public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }
}
