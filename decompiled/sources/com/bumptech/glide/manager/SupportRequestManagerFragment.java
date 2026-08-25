package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
public class SupportRequestManagerFragment extends androidx.fragment.app.Fragment {
    private static final java.lang.String TAG = "SupportRMFragment";
    private final java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> childRequestManagerFragments;
    private final com.bumptech.glide.manager.ActivityFragmentLifecycle lifecycle;

    @androidx.annotation.Nullable
    private androidx.fragment.app.Fragment parentFragmentHint;

    @androidx.annotation.Nullable
    private com.bumptech.glide.RequestManager requestManager;
    private final com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode;

    @androidx.annotation.Nullable
    private com.bumptech.glide.manager.SupportRequestManagerFragment rootRequestManagerFragment;

    public class SupportFragmentRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
        public final /* synthetic */ com.bumptech.glide.manager.SupportRequestManagerFragment this$0;

        public SupportFragmentRequestManagerTreeNode(com.bumptech.glide.manager.SupportRequestManagerFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @androidx.annotation.NonNull
        public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
                r4 = this;
                com.bumptech.glide.manager.SupportRequestManagerFragment r0 = r4.this$0
                java.util.Set r0 = r0.getDescendantRequestManagerFragments()
                java.util.HashSet r1 = new java.util.HashSet
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r0.next()
                com.bumptech.glide.manager.SupportRequestManagerFragment r2 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r2
                com.bumptech.glide.RequestManager r3 = r2.getRequestManager()
                if (r3 == 0) goto L13
                com.bumptech.glide.RequestManager r2 = r2.getRequestManager()
                r1.add(r2)
                goto L13
            L2d:
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                r0.append(r1)
                java.lang.String r1 = "{fragment="
                r0.append(r1)
                com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r2.this$0
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public SupportRequestManagerFragment() {
            r1 = this;
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = new com.bumptech.glide.manager.ActivityFragmentLifecycle
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @android.annotation.SuppressLint({"ValidFragment"})
    @androidx.annotation.VisibleForTesting
    public SupportRequestManagerFragment(@androidx.annotation.NonNull com.bumptech.glide.manager.ActivityFragmentLifecycle r2) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode r0 = new com.bumptech.glide.manager.SupportRequestManagerFragment$SupportFragmentRequestManagerTreeNode
            r0.<init>(r1)
            r1.requestManagerTreeNode = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.childRequestManagerFragments = r0
            r1.lifecycle = r2
            return
    }

    private void addChildRequestManagerFragment(com.bumptech.glide.manager.SupportRequestManagerFragment r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r1.childRequestManagerFragments
            r0.add(r2)
            return
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.Fragment getParentFragmentUsingHint() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.getParentFragment()
            if (r0 == 0) goto L7
            goto L9
        L7:
            androidx.fragment.app.Fragment r0 = r1.parentFragmentHint
        L9:
            return r0
    }

    @androidx.annotation.Nullable
    private static androidx.fragment.app.FragmentManager getRootFragmentManager(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
        L0:
            androidx.fragment.app.Fragment r0 = r1.getParentFragment()
            if (r0 == 0) goto Lb
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            goto L0
        Lb:
            androidx.fragment.app.FragmentManager r1 = r1.getFragmentManager()
            return r1
    }

    private boolean isDescendant(@androidx.annotation.NonNull androidx.fragment.app.Fragment r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.getParentFragmentUsingHint()
        L4:
            androidx.fragment.app.Fragment r1 = r3.getParentFragment()
            if (r1 == 0) goto L17
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L4
        L17:
            r3 = 0
            return r3
    }

    private void registerFragmentWithRoot(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r2) {
            r0 = this;
            r0.unregisterFragmentWithRoot()
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.get(r1)
            com.bumptech.glide.manager.RequestManagerRetriever r1 = r1.getRequestManagerRetriever()
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r1.getSupportRequestManagerFragment(r2)
            r0.rootRequestManagerFragment = r1
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1c
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r0.rootRequestManagerFragment
            r1.addChildRequestManagerFragment(r0)
        L1c:
            return
    }

    private void removeChildRequestManagerFragment(com.bumptech.glide.manager.SupportRequestManagerFragment r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r1.childRequestManagerFragments
            r0.remove(r2)
            return
    }

    private void unregisterFragmentWithRoot() {
            r1 = this;
            com.bumptech.glide.manager.SupportRequestManagerFragment r0 = r1.rootRequestManagerFragment
            if (r0 == 0) goto La
            r0.removeChildRequestManagerFragment(r1)
            r0 = 0
            r1.rootRequestManagerFragment = r0
        La:
            return
    }

    @androidx.annotation.NonNull
    public final java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> getDescendantRequestManagerFragments() {
            r4 = this;
            com.bumptech.glide.manager.SupportRequestManagerFragment r0 = r4.rootRequestManagerFragment
            if (r0 != 0) goto L9
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
        L9:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L16
            java.util.Set<com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r4.childRequestManagerFragments
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        L16:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = r4.rootRequestManagerFragment
            java.util.Set r1 = r1.getDescendantRequestManagerFragments()
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.manager.SupportRequestManagerFragment r2 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r2
            androidx.fragment.app.Fragment r3 = r2.getParentFragmentUsingHint()
            boolean r3 = r4.isDescendant(r3)
            if (r3 == 0) goto L25
            r0.add(r2)
            goto L25
        L3f:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.manager.ActivityFragmentLifecycle getGlideLifecycle() {
            r1 = this;
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            return r0
    }

    @androidx.annotation.Nullable
    public com.bumptech.glide.RequestManager getRequestManager() {
            r1 = this;
            com.bumptech.glide.RequestManager r0 = r1.requestManager
            return r0
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.manager.RequestManagerTreeNode getRequestManagerTreeNode() {
            r1 = this;
            com.bumptech.glide.manager.RequestManagerTreeNode r0 = r1.requestManagerTreeNode
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context r4) {
            r3 = this;
            super.onAttach(r4)
            androidx.fragment.app.FragmentManager r4 = getRootFragmentManager(r3)
            r0 = 5
            java.lang.String r1 = "SupportRMFragment"
            if (r4 != 0) goto L18
            boolean r4 = android.util.Log.isLoggable(r1, r0)
            if (r4 == 0) goto L17
            java.lang.String r4 = "Unable to register fragment with root, ancestor detached"
            android.util.Log.w(r1, r4)
        L17:
            return
        L18:
            android.content.Context r2 = r3.getContext()     // Catch: java.lang.IllegalStateException -> L20
            r3.registerFragmentWithRoot(r2, r4)     // Catch: java.lang.IllegalStateException -> L20
            goto L2c
        L20:
            r4 = move-exception
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "Unable to register fragment with root"
            android.util.Log.w(r1, r0, r4)
        L2c:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            r0.onDestroy()
            r1.unregisterFragmentWithRoot()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
            r1 = this;
            super.onDetach()
            r0 = 0
            r1.parentFragmentHint = r0
            r1.unregisterFragmentWithRoot()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            r0.onStart()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            r0.onStop()
            return
    }

    public final void setParentFragmentHint(@androidx.annotation.Nullable androidx.fragment.app.Fragment r2) {
            r1 = this;
            r1.parentFragmentHint = r2
            if (r2 == 0) goto L19
            android.content.Context r0 = r2.getContext()
            if (r0 != 0) goto Lb
            goto L19
        Lb:
            androidx.fragment.app.FragmentManager r0 = getRootFragmentManager(r2)
            if (r0 != 0) goto L12
            return
        L12:
            android.content.Context r2 = r2.getContext()
            r1.registerFragmentWithRoot(r2, r0)
        L19:
            return
    }

    public void setRequestManager(@androidx.annotation.Nullable com.bumptech.glide.RequestManager r1) {
            r0 = this;
            r0.requestManager = r1
            return
    }

    @Override // androidx.fragment.app.Fragment
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{parent="
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.getParentFragmentUsingHint()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
