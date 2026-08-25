package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes2.dex */
public class RequestManagerRetriever implements android.os.Handler.Callback {
    private static final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory DEFAULT_FACTORY = null;
    private static final java.lang.String FRAGMENT_INDEX_KEY = "key";
    private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
    private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
    private static final java.lang.String TAG = "RMRetriever";
    private volatile com.bumptech.glide.RequestManager applicationManager;
    private final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory factory;
    private final com.bumptech.glide.manager.FrameWaiter frameWaiter;
    private final android.os.Handler handler;

    @androidx.annotation.VisibleForTesting
    public final java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> pendingRequestManagerFragments;

    @androidx.annotation.VisibleForTesting
    public final java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> pendingSupportRequestManagerFragments;
    private final android.os.Bundle tempBundle;
    private final androidx.collection.ArrayMap<android.view.View, android.app.Fragment> tempViewToFragment;
    private final androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> tempViewToSupportFragment;


    public interface RequestManagerFactory {
        @androidx.annotation.NonNull
        com.bumptech.glide.RequestManager build(@androidx.annotation.NonNull com.bumptech.glide.Glide r1, @androidx.annotation.NonNull com.bumptech.glide.manager.Lifecycle r2, @androidx.annotation.NonNull com.bumptech.glide.manager.RequestManagerTreeNode r3, @androidx.annotation.NonNull android.content.Context r4);
    }

    static {
            com.bumptech.glide.manager.RequestManagerRetriever$1 r0 = new com.bumptech.glide.manager.RequestManagerRetriever$1
            r0.<init>()
            com.bumptech.glide.manager.RequestManagerRetriever.DEFAULT_FACTORY = r0
            return
    }

    public RequestManagerRetriever(@androidx.annotation.Nullable com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory r2, com.bumptech.glide.GlideExperiments r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.pendingRequestManagerFragments = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.pendingSupportRequestManagerFragments = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.tempViewToSupportFragment = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            r1.tempViewToFragment = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.tempBundle = r0
            if (r2 == 0) goto L29
            goto L2b
        L29:
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r2 = com.bumptech.glide.manager.RequestManagerRetriever.DEFAULT_FACTORY
        L2b:
            r1.factory = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r2.<init>(r0, r1)
            r1.handler = r2
            com.bumptech.glide.manager.FrameWaiter r2 = buildFrameWaiter(r3)
            r1.frameWaiter = r2
            return
    }

    @android.annotation.TargetApi(17)
    private static void assertNotDestroyed(@androidx.annotation.NonNull android.app.Activity r1) {
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            r1.<init>(r0)
            throw r1
    }

    private static com.bumptech.glide.manager.FrameWaiter buildFrameWaiter(com.bumptech.glide.GlideExperiments r1) {
            boolean r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED
            if (r0 == 0) goto L1d
            boolean r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED
            if (r0 != 0) goto L9
            goto L1d
        L9:
            java.lang.Class<com.bumptech.glide.GlideBuilder$WaitForFramesAfterTrimMemory> r0 = com.bumptech.glide.GlideBuilder.WaitForFramesAfterTrimMemory.class
            boolean r1 = r1.isEnabled(r0)
            if (r1 == 0) goto L17
            com.bumptech.glide.manager.FirstFrameAndAfterTrimMemoryWaiter r1 = new com.bumptech.glide.manager.FirstFrameAndAfterTrimMemoryWaiter
            r1.<init>()
            goto L1c
        L17:
            com.bumptech.glide.manager.FirstFrameWaiter r1 = new com.bumptech.glide.manager.FirstFrameWaiter
            r1.<init>()
        L1c:
            return r1
        L1d:
            com.bumptech.glide.manager.DoNothingFirstFrameWaiter r1 = new com.bumptech.glide.manager.DoNothingFirstFrameWaiter
            r1.<init>()
            return r1
    }

    @androidx.annotation.Nullable
    private static android.app.Activity findActivity(@androidx.annotation.NonNull android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.app.Activity r1 = findActivity(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    @android.annotation.TargetApi(26)
    @java.lang.Deprecated
    private void findAllFragmentsWithViews(@androidx.annotation.NonNull android.app.FragmentManager r3, @androidx.annotation.NonNull androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2f
            java.util.List r3 = r3.getFragments()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()
            android.app.Fragment r0 = (android.app.Fragment) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto Le
            android.view.View r1 = r0.getView()
            r4.put(r1, r0)
            android.app.FragmentManager r0 = r0.getChildFragmentManager()
            r2.findAllFragmentsWithViews(r0, r4)
            goto Le
        L2f:
            r2.findAllFragmentsWithViewsPreO(r3, r4)
        L32:
            return
    }

    @java.lang.Deprecated
    private void findAllFragmentsWithViewsPreO(@androidx.annotation.NonNull android.app.FragmentManager r5, @androidx.annotation.NonNull androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r6) {
            r4 = this;
            r0 = 0
        L1:
            android.os.Bundle r1 = r4.tempBundle
            int r2 = r0 + 1
            java.lang.String r3 = "key"
            r1.putInt(r3, r0)
            r0 = 0
            android.os.Bundle r1 = r4.tempBundle     // Catch: java.lang.Exception -> L12
            android.app.Fragment r0 = r5.getFragment(r1, r3)     // Catch: java.lang.Exception -> L12
            goto L13
        L12:
        L13:
            if (r0 != 0) goto L16
            return
        L16:
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L2a
            android.view.View r1 = r0.getView()
            r6.put(r1, r0)
            android.app.FragmentManager r0 = r0.getChildFragmentManager()
            r4.findAllFragmentsWithViews(r0, r6)
        L2a:
            r0 = r2
            goto L1
    }

    private static void findAllSupportFragmentsWithViews(@androidx.annotation.Nullable java.util.Collection<androidx.fragment.app.Fragment> r2, @androidx.annotation.NonNull java.util.Map<android.view.View, androidx.fragment.app.Fragment> r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L7
            android.view.View r1 = r0.getView()
            if (r1 != 0) goto L1c
            goto L7
        L1c:
            android.view.View r1 = r0.getView()
            r3.put(r1, r0)
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.getFragments()
            findAllSupportFragmentsWithViews(r0, r3)
            goto L7
        L2f:
            return
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    private android.app.Fragment findFragment(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.app.Activity r4) {
            r2 = this;
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r0 = r2.tempViewToFragment
            r0.clear()
            android.app.FragmentManager r0 = r4.getFragmentManager()
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r1 = r2.tempViewToFragment
            r2.findAllFragmentsWithViews(r0, r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            r0 = 0
        L16:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L36
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r0 = r2.tempViewToFragment
            java.lang.Object r0 = r0.get(r3)
            android.app.Fragment r0 = (android.app.Fragment) r0
            if (r0 == 0) goto L27
            goto L36
        L27:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L36
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L16
        L36:
            androidx.collection.ArrayMap<android.view.View, android.app.Fragment> r3 = r2.tempViewToFragment
            r3.clear()
            return r0
    }

    @androidx.annotation.Nullable
    private androidx.fragment.app.Fragment findSupportFragment(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r4) {
            r2 = this;
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r0 = r2.tempViewToSupportFragment
            r0.clear()
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            java.util.List r0 = r0.getFragments()
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r1 = r2.tempViewToSupportFragment
            findAllSupportFragmentsWithViews(r0, r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            r0 = 0
        L1a:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L3a
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r0 = r2.tempViewToSupportFragment
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L2b
            goto L3a
        L2b:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L3a
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L1a
        L3a:
            androidx.collection.ArrayMap<android.view.View, androidx.fragment.app.Fragment> r3 = r2.tempViewToSupportFragment
            r3.clear()
            return r0
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    private com.bumptech.glide.RequestManager fragmentGet(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.app.FragmentManager r5, @androidx.annotation.Nullable android.app.Fragment r6, boolean r7) {
            r3 = this;
            com.bumptech.glide.manager.RequestManagerFragment r5 = r3.getRequestManagerFragment(r5, r6)
            com.bumptech.glide.RequestManager r6 = r5.getRequestManager()
            if (r6 != 0) goto L24
            com.bumptech.glide.Glide r6 = com.bumptech.glide.Glide.get(r4)
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r0 = r3.factory
            com.bumptech.glide.manager.ActivityFragmentLifecycle r1 = r5.getGlideLifecycle()
            com.bumptech.glide.manager.RequestManagerTreeNode r2 = r5.getRequestManagerTreeNode()
            com.bumptech.glide.RequestManager r6 = r0.build(r6, r1, r2, r4)
            if (r7 == 0) goto L21
            r6.onStart()
        L21:
            r5.setRequestManager(r6)
        L24:
            return r6
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.RequestManager getApplicationManager(@androidx.annotation.NonNull android.content.Context r5) {
            r4 = this;
            com.bumptech.glide.RequestManager r0 = r4.applicationManager
            if (r0 != 0) goto L2c
            monitor-enter(r4)
            com.bumptech.glide.RequestManager r0 = r4.applicationManager     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L27
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r0)     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r1 = r4.factory     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.manager.ApplicationLifecycle r2 = new com.bumptech.glide.manager.ApplicationLifecycle     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.manager.EmptyRequestManagerTreeNode r3 = new com.bumptech.glide.manager.EmptyRequestManagerTreeNode     // Catch: java.lang.Throwable -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L29
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L29
            com.bumptech.glide.RequestManager r5 = r1.build(r0, r2, r3, r5)     // Catch: java.lang.Throwable -> L29
            r4.applicationManager = r5     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L29
            throw r5
        L2c:
            com.bumptech.glide.RequestManager r5 = r4.applicationManager
            return r5
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.manager.RequestManagerFragment getRequestManagerFragment(@androidx.annotation.NonNull android.app.FragmentManager r3, @androidx.annotation.Nullable android.app.Fragment r4) {
            r2 = this;
            java.lang.String r0 = "com.bumptech.glide.manager"
            android.app.Fragment r1 = r3.findFragmentByTag(r0)
            com.bumptech.glide.manager.RequestManagerFragment r1 = (com.bumptech.glide.manager.RequestManagerFragment) r1
            if (r1 != 0) goto L36
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> r1 = r2.pendingRequestManagerFragments
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.manager.RequestManagerFragment r1 = (com.bumptech.glide.manager.RequestManagerFragment) r1
            if (r1 != 0) goto L36
            com.bumptech.glide.manager.RequestManagerFragment r1 = new com.bumptech.glide.manager.RequestManagerFragment
            r1.<init>()
            r1.setParentFragmentHint(r4)
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> r4 = r2.pendingRequestManagerFragments
            r4.put(r3, r1)
            android.app.FragmentTransaction r4 = r3.beginTransaction()
            android.app.FragmentTransaction r4 = r4.add(r1, r0)
            r4.commitAllowingStateLoss()
            android.os.Handler r4 = r2.handler
            r0 = 1
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            r3.sendToTarget()
        L36:
            return r1
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.manager.SupportRequestManagerFragment getSupportRequestManagerFragment(@androidx.annotation.NonNull androidx.fragment.app.FragmentManager r3, @androidx.annotation.Nullable androidx.fragment.app.Fragment r4) {
            r2 = this;
            java.lang.String r0 = "com.bumptech.glide.manager"
            androidx.fragment.app.Fragment r1 = r3.findFragmentByTag(r0)
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r1
            if (r1 != 0) goto L36
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r1 = r2.pendingSupportRequestManagerFragments
            java.lang.Object r1 = r1.get(r3)
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = (com.bumptech.glide.manager.SupportRequestManagerFragment) r1
            if (r1 != 0) goto L36
            com.bumptech.glide.manager.SupportRequestManagerFragment r1 = new com.bumptech.glide.manager.SupportRequestManagerFragment
            r1.<init>()
            r1.setParentFragmentHint(r4)
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r4 = r2.pendingSupportRequestManagerFragments
            r4.put(r3, r1)
            androidx.fragment.app.FragmentTransaction r4 = r3.beginTransaction()
            androidx.fragment.app.FragmentTransaction r4 = r4.add(r1, r0)
            r4.commitAllowingStateLoss()
            android.os.Handler r4 = r2.handler
            r0 = 2
            android.os.Message r3 = r4.obtainMessage(r0, r3)
            r3.sendToTarget()
        L36:
            return r1
    }

    private static boolean isActivityVisible(android.content.Context r0) {
            android.app.Activity r0 = findActivity(r0)
            if (r0 == 0) goto Lf
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @androidx.annotation.NonNull
    private com.bumptech.glide.RequestManager supportFragmentGet(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.fragment.app.FragmentManager r5, @androidx.annotation.Nullable androidx.fragment.app.Fragment r6, boolean r7) {
            r3 = this;
            com.bumptech.glide.manager.SupportRequestManagerFragment r5 = r3.getSupportRequestManagerFragment(r5, r6)
            com.bumptech.glide.RequestManager r6 = r5.getRequestManager()
            if (r6 != 0) goto L24
            com.bumptech.glide.Glide r6 = com.bumptech.glide.Glide.get(r4)
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r0 = r3.factory
            com.bumptech.glide.manager.ActivityFragmentLifecycle r1 = r5.getGlideLifecycle()
            com.bumptech.glide.manager.RequestManagerTreeNode r2 = r5.getRequestManagerTreeNode()
            com.bumptech.glide.RequestManager r6 = r0.build(r6, r1, r2, r4)
            if (r7 == 0) goto L21
            r6.onStart()
        L21:
            r5.setRequestManager(r6)
        L24:
            return r6
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestManager get(@androidx.annotation.NonNull android.app.Activity r4) {
            r3 = this;
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto Lf
            android.content.Context r4 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r4 = r3.get(r4)
            return r4
        Lf:
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L1a
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            com.bumptech.glide.RequestManager r4 = r3.get(r4)
            return r4
        L1a:
            assertNotDestroyed(r4)
            com.bumptech.glide.manager.FrameWaiter r0 = r3.frameWaiter
            r0.registerSelf(r4)
            android.app.FragmentManager r0 = r4.getFragmentManager()
            r1 = 0
            boolean r2 = isActivityVisible(r4)
            com.bumptech.glide.RequestManager r4 = r3.fragmentGet(r4, r0, r1, r2)
            return r4
    }

    @androidx.annotation.NonNull
    @android.annotation.TargetApi(17)
    @java.lang.Deprecated
    public com.bumptech.glide.RequestManager get(@androidx.annotation.NonNull android.app.Fragment r4) {
            r3 = this;
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L39
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 != 0) goto L2c
            android.app.Activity r0 = r4.getActivity()
            if (r0 == 0) goto L1b
            com.bumptech.glide.manager.FrameWaiter r0 = r3.frameWaiter
            android.app.Activity r1 = r4.getActivity()
            r0.registerSelf(r1)
        L1b:
            android.app.FragmentManager r0 = r4.getChildFragmentManager()
            android.app.Activity r1 = r4.getActivity()
            boolean r2 = r4.isVisible()
            com.bumptech.glide.RequestManager r4 = r3.fragmentGet(r1, r0, r4, r2)
            return r4
        L2c:
            android.app.Activity r4 = r4.getActivity()
            android.content.Context r4 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r4 = r3.get(r4)
            return r4
        L39:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached"
            r4.<init>(r0)
            throw r4
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestManager get(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            if (r3 == 0) goto L41
            boolean r0 = com.bumptech.glide.util.Util.isOnMainThread()
            if (r0 == 0) goto L3c
            boolean r0 = r3 instanceof android.app.Application
            if (r0 != 0) goto L3c
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L17:
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L22
            android.app.Activity r3 = (android.app.Activity) r3
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L22:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L3c
            r0 = r3
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            android.content.Context r1 = r1.getApplicationContext()
            if (r1 == 0) goto L3c
            android.content.Context r3 = r0.getBaseContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L3c:
            com.bumptech.glide.RequestManager r3 = r2.getApplicationManager(r3)
            return r3
        L41:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a null Context"
            r3.<init>(r0)
            throw r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestManager get(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto L13
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L13:
            com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Unable to obtain a request manager for a view without a Context"
            com.bumptech.glide.util.Preconditions.checkNotNull(r0, r1)
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = findActivity(r0)
            if (r0 != 0) goto L36
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L36:
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L4c
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.Fragment r3 = r2.findSupportFragment(r3, r0)
            if (r3 == 0) goto L47
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            goto L4b
        L47:
            com.bumptech.glide.RequestManager r3 = r2.get(r0)
        L4b:
            return r3
        L4c:
            android.app.Fragment r3 = r2.findFragment(r3, r0)
            if (r3 != 0) goto L57
            com.bumptech.glide.RequestManager r3 = r2.get(r0)
            return r3
        L57:
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestManager get(@androidx.annotation.NonNull androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            com.bumptech.glide.util.Preconditions.checkNotNull(r0, r1)
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto L1c
            android.content.Context r4 = r4.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r4 = r3.get(r4)
            return r4
        L1c:
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L2b
            com.bumptech.glide.manager.FrameWaiter r0 = r3.frameWaiter
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            r0.registerSelf(r1)
        L2b:
            androidx.fragment.app.FragmentManager r0 = r4.getChildFragmentManager()
            android.content.Context r1 = r4.getContext()
            boolean r2 = r4.isVisible()
            com.bumptech.glide.RequestManager r4 = r3.supportFragmentGet(r1, r0, r4, r2)
            return r4
    }

    @androidx.annotation.NonNull
    public com.bumptech.glide.RequestManager get(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity r4) {
            r3 = this;
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto Lf
            android.content.Context r4 = r4.getApplicationContext()
            com.bumptech.glide.RequestManager r4 = r3.get(r4)
            return r4
        Lf:
            assertNotDestroyed(r4)
            com.bumptech.glide.manager.FrameWaiter r0 = r3.frameWaiter
            r0.registerSelf(r4)
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            r1 = 0
            boolean r2 = isActivityVisible(r4)
            com.bumptech.glide.RequestManager r4 = r3.supportFragmentGet(r4, r0, r1, r2)
            return r4
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public final com.bumptech.glide.manager.RequestManagerFragment getRequestManagerFragment(android.app.Activity r2) {
            r1 = this;
            android.app.FragmentManager r2 = r2.getFragmentManager()
            r0 = 0
            com.bumptech.glide.manager.RequestManagerFragment r2 = r1.getRequestManagerFragment(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    public final com.bumptech.glide.manager.SupportRequestManagerFragment getSupportRequestManagerFragment(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            com.bumptech.glide.manager.SupportRequestManagerFragment r2 = r1.getSupportRequestManagerFragment(r2, r0)
            return r2
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto Lc
            r2 = 0
            r5 = r1
            goto L24
        Lc:
            java.lang.Object r5 = r5.obj
            androidx.fragment.app.FragmentManager r5 = (androidx.fragment.app.FragmentManager) r5
            java.util.Map<androidx.fragment.app.FragmentManager, com.bumptech.glide.manager.SupportRequestManagerFragment> r0 = r4.pendingSupportRequestManagerFragments
            java.lang.Object r0 = r0.remove(r5)
            goto L21
        L17:
            java.lang.Object r5 = r5.obj
            android.app.FragmentManager r5 = (android.app.FragmentManager) r5
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment> r0 = r4.pendingRequestManagerFragments
            java.lang.Object r0 = r0.remove(r5)
        L21:
            r1 = r5
            r5 = r1
            r1 = r0
        L24:
            if (r2 == 0) goto L45
            if (r1 != 0) goto L45
            r0 = 5
            java.lang.String r1 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.w(r1, r5)
        L45:
            return r2
    }
}
