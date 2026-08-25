package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class RequestManagerFragment extends android.app.Fragment {
    private static final java.lang.String TAG = "RMFragment";
    private final java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> childRequestManagerFragments;
    private final com.bumptech.glide.manager.ActivityFragmentLifecycle lifecycle;

    @androidx.annotation.Nullable
    private android.app.Fragment parentFragmentHint;

    @androidx.annotation.Nullable
    private com.bumptech.glide.RequestManager requestManager;
    private final com.bumptech.glide.manager.RequestManagerTreeNode requestManagerTreeNode;

    @androidx.annotation.Nullable
    private com.bumptech.glide.manager.RequestManagerFragment rootRequestManagerFragment;

    /* JADX INFO: loaded from: classes2.dex */
    public class FragmentRequestManagerTreeNode implements com.bumptech.glide.manager.RequestManagerTreeNode {
        public final /* synthetic */ com.bumptech.glide.manager.RequestManagerFragment this$0;

        public FragmentRequestManagerTreeNode(com.bumptech.glide.manager.RequestManagerFragment r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.manager.RequestManagerTreeNode
        @androidx.annotation.NonNull
        public java.util.Set<com.bumptech.glide.RequestManager> getDescendants() {
                r4 = this;
                com.bumptech.glide.manager.RequestManagerFragment r0 = r4.this$0
                java.util.Set r0 = r0.getDescendantRequestManagerFragments()
                java.util.HashSet r1 = new java.util.HashSet
                int r2 = r0.size()
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r0.next()
                com.bumptech.glide.manager.RequestManagerFragment r2 = (com.bumptech.glide.manager.RequestManagerFragment) r2
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
                com.bumptech.glide.manager.RequestManagerFragment r1 = r2.this$0
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public RequestManagerFragment() {
            r2 = this;
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = new com.bumptech.glide.manager.ActivityFragmentLifecycle
            r0.<init>()
            r2.<init>()
            com.bumptech.glide.manager.RequestManagerFragment$FragmentRequestManagerTreeNode r1 = new com.bumptech.glide.manager.RequestManagerFragment$FragmentRequestManagerTreeNode
            r1.<init>(r2)
            r2.requestManagerTreeNode = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2.childRequestManagerFragments = r1
            r2.lifecycle = r0
            return
    }

    private void addChildRequestManagerFragment(com.bumptech.glide.manager.RequestManagerFragment r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> r0 = r1.childRequestManagerFragments
            r0.add(r2)
            return
    }

    @androidx.annotation.Nullable
    @android.annotation.TargetApi(17)
    private android.app.Fragment getParentFragmentUsingHint() {
            r1 = this;
            android.app.Fragment r0 = r1.getParentFragment()
            if (r0 == 0) goto L7
            goto L9
        L7:
            android.app.Fragment r0 = r1.parentFragmentHint
        L9:
            return r0
    }

    @android.annotation.TargetApi(17)
    private boolean isDescendant(@androidx.annotation.NonNull android.app.Fragment r3) {
            r2 = this;
            android.app.Fragment r0 = r2.getParentFragment()
        L4:
            android.app.Fragment r1 = r3.getParentFragment()
            if (r1 == 0) goto L17
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            android.app.Fragment r3 = r3.getParentFragment()
            goto L4
        L17:
            r3 = 0
            return r3
    }

    private void registerFragmentWithRoot(@androidx.annotation.NonNull android.app.Activity r2) {
            r1 = this;
            r1.unregisterFragmentWithRoot()
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r2)
            com.bumptech.glide.manager.RequestManagerRetriever r0 = r0.getRequestManagerRetriever()
            com.bumptech.glide.manager.RequestManagerFragment r2 = r0.getRequestManagerFragment(r2)
            r1.rootRequestManagerFragment = r2
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L1c
            com.bumptech.glide.manager.RequestManagerFragment r2 = r1.rootRequestManagerFragment
            r2.addChildRequestManagerFragment(r1)
        L1c:
            return
    }

    private void removeChildRequestManagerFragment(com.bumptech.glide.manager.RequestManagerFragment r2) {
            r1 = this;
            java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> r0 = r1.childRequestManagerFragments
            r0.remove(r2)
            return
    }

    private void unregisterFragmentWithRoot() {
            r1 = this;
            com.bumptech.glide.manager.RequestManagerFragment r0 = r1.rootRequestManagerFragment
            if (r0 == 0) goto La
            r0.removeChildRequestManagerFragment(r1)
            r0 = 0
            r1.rootRequestManagerFragment = r0
        La:
            return
    }

    @androidx.annotation.NonNull
    @android.annotation.TargetApi(17)
    public final java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> getDescendantRequestManagerFragments() {
            r4 = this;
            com.bumptech.glide.manager.RequestManagerFragment r0 = r4.rootRequestManagerFragment
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            java.util.Set<com.bumptech.glide.manager.RequestManagerFragment> r0 = r4.childRequestManagerFragments
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        Lf:
            com.bumptech.glide.manager.RequestManagerFragment r0 = r4.rootRequestManagerFragment
            if (r0 == 0) goto L41
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.bumptech.glide.manager.RequestManagerFragment r1 = r4.rootRequestManagerFragment
            java.util.Set r1 = r1.getDescendantRequestManagerFragments()
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.manager.RequestManagerFragment r2 = (com.bumptech.glide.manager.RequestManagerFragment) r2
            android.app.Fragment r3 = r2.getParentFragment()
            boolean r3 = r4.isDescendant(r3)
            if (r3 == 0) goto L22
            r0.add(r2)
            goto L22
        L3c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
        L41:
            java.util.Set r0 = java.util.Collections.emptySet()
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

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity r3) {
            r2 = this;
            super.onAttach(r3)
            r2.registerFragmentWithRoot(r3)     // Catch: java.lang.IllegalStateException -> L7
            goto L16
        L7:
            r3 = move-exception
            r0 = 5
            java.lang.String r1 = "RMFragment"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = "Unable to register fragment with root"
            android.util.Log.w(r1, r0, r3)
        L16:
            return
    }

    @Override // android.app.Fragment
    public void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            r0.onDestroy()
            r1.unregisterFragmentWithRoot()
            return
    }

    @Override // android.app.Fragment
    public void onDetach() {
            r0 = this;
            super.onDetach()
            r0.unregisterFragmentWithRoot()
            return
    }

    @Override // android.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            r0.onStart()
            return
    }

    @Override // android.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            com.bumptech.glide.manager.ActivityFragmentLifecycle r0 = r1.lifecycle
            r0.onStop()
            return
    }

    public final void setParentFragmentHint(@androidx.annotation.Nullable android.app.Fragment r2) {
            r1 = this;
            r1.parentFragmentHint = r2
            if (r2 == 0) goto L11
            android.app.Activity r0 = r2.getActivity()
            if (r0 == 0) goto L11
            android.app.Activity r2 = r2.getActivity()
            r1.registerFragmentWithRoot(r2)
        L11:
            return
    }

    public void setRequestManager(@androidx.annotation.Nullable com.bumptech.glide.RequestManager r1) {
            r0 = this;
            r0.requestManager = r1
            return
    }

    @Override // android.app.Fragment
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{parent="
            r0.append(r1)
            android.app.Fragment r1 = r2.getParentFragmentUsingHint()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
