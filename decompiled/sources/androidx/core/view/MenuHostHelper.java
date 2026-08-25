package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class MenuHostHelper {
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> mMenuProviders;
    private final java.lang.Runnable mOnInvalidateMenuCallback;
    private final java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper.LifecycleContainer> mProviderToLifecycleContainers;

    /* JADX INFO: loaded from: classes2.dex */
    public static class LifecycleContainer {
        public final androidx.lifecycle.Lifecycle mLifecycle;
        private androidx.lifecycle.LifecycleEventObserver mObserver;

        public LifecycleContainer(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle r1, @androidx.annotation.NonNull androidx.lifecycle.LifecycleEventObserver r2) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mObserver = r2
                r1.addObserver(r2)
                return
        }

        public final void clearObservers() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                r0 = 0
                r2.mObserver = r0
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$VnUJXnvHt4N_mEoh2slqiieT0pg(androidx.core.view.MenuHostHelper r0, androidx.lifecycle.Lifecycle.State r1, androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r0.lambda$addMenuProvider$1(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$yJLrCbQs1VMDQOb-UI1XiFiSaTs, reason: not valid java name */
    public static /* synthetic */ void m36$r8$lambda$yJLrCbQs1VMDQObUI1XiFiSaTs(androidx.core.view.MenuHostHelper r0, androidx.core.view.MenuProvider r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r0.lambda$addMenuProvider$0(r1, r2, r3)
            return
    }

    public MenuHostHelper(@androidx.annotation.NonNull java.lang.Runnable r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.mMenuProviders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mProviderToLifecycleContainers = r0
            r1.mOnInvalidateMenuCallback = r2
            return
    }

    private /* synthetic */ void lambda$addMenuProvider$0(androidx.core.view.MenuProvider r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r0 = this;
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r3 != r2) goto L7
            r0.removeMenuProvider(r1)
        L7:
            return
    }

    private /* synthetic */ void lambda$addMenuProvider$1(androidx.lifecycle.Lifecycle.State r1, androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r0 = this;
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.upTo(r1)
            if (r4 != r3) goto La
            r0.addMenuProvider(r2)
            goto L22
        La:
            androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 != r3) goto L12
            r0.removeMenuProvider(r2)
            goto L22
        L12:
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.downFrom(r1)
            if (r4 != r1) goto L22
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r1 = r0.mMenuProviders
            r1.remove(r2)
            java.lang.Runnable r1 = r0.mOnInvalidateMenuCallback
            r1.run()
        L22:
            return
    }

    public void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r1.mMenuProviders
            r0.add(r2)
            java.lang.Runnable r2 = r1.mOnInvalidateMenuCallback
            r2.run()
            return
    }

    public void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r4, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r5) {
            r3 = this;
            r3.addMenuProvider(r4)
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r0 = r3.mProviderToLifecycleContainers
            java.lang.Object r0 = r0.remove(r4)
            androidx.core.view.MenuHostHelper$LifecycleContainer r0 = (androidx.core.view.MenuHostHelper.LifecycleContainer) r0
            if (r0 == 0) goto L14
            r0.clearObservers()
        L14:
            androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0 r0 = new androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0
            r0.<init>(r3, r4)
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r1 = r3.mProviderToLifecycleContainers
            androidx.core.view.MenuHostHelper$LifecycleContainer r2 = new androidx.core.view.MenuHostHelper$LifecycleContainer
            r2.<init>(r5, r0)
            r1.put(r4, r2)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public void addMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r3, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r4, @androidx.annotation.NonNull androidx.lifecycle.Lifecycle.State r5) {
            r2 = this;
            androidx.lifecycle.Lifecycle r4 = r4.getLifecycle()
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r0 = r2.mProviderToLifecycleContainers
            java.lang.Object r0 = r0.remove(r3)
            androidx.core.view.MenuHostHelper$LifecycleContainer r0 = (androidx.core.view.MenuHostHelper.LifecycleContainer) r0
            if (r0 == 0) goto L11
            r0.clearObservers()
        L11:
            androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1 r0 = new androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1
            r0.<init>(r2, r5, r3)
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r5 = r2.mProviderToLifecycleContainers
            androidx.core.view.MenuHostHelper$LifecycleContainer r1 = new androidx.core.view.MenuHostHelper$LifecycleContainer
            r1.<init>(r4, r0)
            r5.put(r3, r1)
            return
    }

    public void onCreateMenu(@androidx.annotation.NonNull android.view.Menu r3, @androidx.annotation.NonNull android.view.MenuInflater r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            r1.onCreateMenu(r3, r4)
            goto L6
        L16:
            return
    }

    public void onMenuClosed(@androidx.annotation.NonNull android.view.Menu r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            r1.onMenuClosed(r3)
            goto L6
        L16:
            return
    }

    public boolean onMenuItemSelected(@androidx.annotation.NonNull android.view.MenuItem r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            boolean r1 = r1.onMenuItemSelected(r3)
            if (r1 == 0) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public void onPrepareMenu(@androidx.annotation.NonNull android.view.Menu r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r2.mMenuProviders
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.core.view.MenuProvider r1 = (androidx.core.view.MenuProvider) r1
            r1.onPrepareMenu(r3)
            goto L6
        L16:
            return
    }

    public void removeMenuProvider(@androidx.annotation.NonNull androidx.core.view.MenuProvider r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> r0 = r1.mMenuProviders
            r0.remove(r2)
            java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper$LifecycleContainer> r0 = r1.mProviderToLifecycleContainers
            java.lang.Object r2 = r0.remove(r2)
            androidx.core.view.MenuHostHelper$LifecycleContainer r2 = (androidx.core.view.MenuHostHelper.LifecycleContainer) r2
            if (r2 == 0) goto L12
            r2.clearObservers()
        L12:
            java.lang.Runnable r2 = r1.mOnInvalidateMenuCallback
            r2.run()
            return
    }
}
