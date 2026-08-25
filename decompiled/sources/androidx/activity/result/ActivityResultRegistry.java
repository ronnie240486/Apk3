package androidx.activity.result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ActivityResultRegistry {
    private static final int INITIAL_REQUEST_CODE_VALUE = 65536;
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_PENDING_RESULTS = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    private static final java.lang.String KEY_COMPONENT_ACTIVITY_REGISTERED_RCS = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    private static final java.lang.String LOG_TAG = "ActivityResultRegistry";
    public final transient java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.CallbackAndContract<?>> mKeyToCallback;
    private final java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry.LifecycleContainer> mKeyToLifecycleContainers;
    public final java.util.Map<java.lang.String, java.lang.Integer> mKeyToRc;
    public java.util.ArrayList<java.lang.String> mLaunchedKeys;
    public final java.util.Map<java.lang.String, java.lang.Object> mParsedPendingResults;
    public final android.os.Bundle mPendingResults;
    private java.util.Random mRandom;
    private final java.util.Map<java.lang.Integer, java.lang.String> mRcToKey;




    public static class CallbackAndContract<O> {
        public final androidx.activity.result.ActivityResultCallback<O> mCallback;
        public final androidx.activity.result.contract.ActivityResultContract<?, O> mContract;

        public CallbackAndContract(androidx.activity.result.ActivityResultCallback<O> r1, androidx.activity.result.contract.ActivityResultContract<?, O> r2) {
                r0 = this;
                r0.<init>()
                r0.mCallback = r1
                r0.mContract = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LifecycleContainer {
        public final androidx.lifecycle.Lifecycle mLifecycle;
        private final java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> mObservers;

        public LifecycleContainer(@androidx.annotation.NonNull androidx.lifecycle.Lifecycle r1) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.mObservers = r1
                return
        }

        public final void addObserver(@androidx.annotation.NonNull androidx.lifecycle.LifecycleEventObserver r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                r0.addObserver(r2)
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r1.mObservers
                r0.add(r2)
                return
        }

        public final void clearObservers() {
                r3 = this;
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r3.mObservers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                androidx.lifecycle.LifecycleEventObserver r1 = (androidx.lifecycle.LifecycleEventObserver) r1
                androidx.lifecycle.Lifecycle r2 = r3.mLifecycle
                r2.removeObserver(r1)
                goto L6
            L18:
                java.util.ArrayList<androidx.lifecycle.LifecycleEventObserver> r0 = r3.mObservers
                r0.clear()
                return
        }
    }

    public ActivityResultRegistry() {
            r1 = this;
            r1.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.mRandom = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRcToKey = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mKeyToRc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mKeyToLifecycleContainers = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mLaunchedKeys = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mKeyToCallback = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mParsedPendingResults = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.mPendingResults = r0
            return
    }

    private void bindRcKey(int r3, java.lang.String r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.mRcToKey
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.mKeyToRc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r3)
            return
    }

    private <O> void doDispatch(java.lang.String r2, int r3, @androidx.annotation.Nullable android.content.Intent r4, @androidx.annotation.Nullable androidx.activity.result.ActivityResultRegistry.CallbackAndContract<O> r5) {
            r1 = this;
            if (r5 == 0) goto L1f
            androidx.activity.result.ActivityResultCallback<O> r0 = r5.mCallback
            if (r0 == 0) goto L1f
            java.util.ArrayList<java.lang.String> r0 = r1.mLaunchedKeys
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1f
            androidx.activity.result.ActivityResultCallback<O> r0 = r5.mCallback
            androidx.activity.result.contract.ActivityResultContract<?, O> r5 = r5.mContract
            java.lang.Object r3 = r5.parseResult(r3, r4)
            r0.onActivityResult(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mLaunchedKeys
            r3.remove(r2)
            goto L2e
        L1f:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.mParsedPendingResults
            r5.remove(r2)
            android.os.Bundle r5 = r1.mPendingResults
            androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
            r0.<init>(r3, r4)
            r5.putParcelable(r2, r0)
        L2e:
            return
    }

    private int generateRandomNumber() {
            r5 = this;
            java.util.Random r0 = r5.mRandom
            r1 = 2147418112(0x7fff0000, float:NaN)
            int r0 = r0.nextInt(r1)
            r2 = 65536(0x10000, float:9.1835E-41)
        La:
            int r0 = r0 + r2
            java.util.Map<java.lang.Integer, java.lang.String> r3 = r5.mRcToKey
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L1e
            java.util.Random r0 = r5.mRandom
            int r0 = r0.nextInt(r1)
            goto La
        L1e:
            return r0
    }

    private void registerKey(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r1.mKeyToRc
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb
            return
        Lb:
            int r0 = r1.generateRandomNumber()
            r1.bindRcKey(r0, r2)
            return
    }

    @androidx.annotation.MainThread
    public final boolean dispatchResult(int r2, int r3, @androidx.annotation.Nullable android.content.Intent r4) {
            r1 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r1.mRcToKey
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r1.mKeyToCallback
            java.lang.Object r0 = r0.get(r2)
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r0 = (androidx.activity.result.ActivityResultRegistry.CallbackAndContract) r0
            r1.doDispatch(r2, r3, r4, r0)
            r2 = 1
            return r2
    }

    @androidx.annotation.MainThread
    public final <O> boolean dispatchResult(int r3, @android.annotation.SuppressLint({"UnknownNullness"}) O r4) {
            r2 = this;
            java.util.Map<java.lang.Integer, java.lang.String> r0 = r2.mRcToKey
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L10
            r3 = 0
            return r3
        L10:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r2.mKeyToCallback
            java.lang.Object r0 = r0.get(r3)
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r0 = (androidx.activity.result.ActivityResultRegistry.CallbackAndContract) r0
            if (r0 == 0) goto L2b
            androidx.activity.result.ActivityResultCallback<O> r0 = r0.mCallback
            if (r0 != 0) goto L1f
            goto L2b
        L1f:
            java.util.ArrayList<java.lang.String> r1 = r2.mLaunchedKeys
            boolean r3 = r1.remove(r3)
            if (r3 == 0) goto L35
            r0.onActivityResult(r4)
            goto L35
        L2b:
            android.os.Bundle r0 = r2.mPendingResults
            r0.remove(r3)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mParsedPendingResults
            r0.put(r3, r4)
        L35:
            r3 = 1
            return r3
    }

    @androidx.annotation.MainThread
    public abstract <I, O> void onLaunch(int r1, @androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r2, @android.annotation.SuppressLint({"UnknownNullness"}) I r3, @androidx.annotation.Nullable androidx.core.app.ActivityOptionsCompat r4);

    public final void onRestoreInstanceState(@androidx.annotation.Nullable android.os.Bundle r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            java.util.ArrayList r0 = r6.getIntegerArrayList(r0)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            java.util.ArrayList r1 = r6.getStringArrayList(r1)
            if (r1 == 0) goto L71
            if (r0 != 0) goto L14
            goto L71
        L14:
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            java.util.ArrayList r2 = r6.getStringArrayList(r2)
            r5.mLaunchedKeys = r2
            java.lang.String r2 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
            java.io.Serializable r2 = r6.getSerializable(r2)
            java.util.Random r2 = (java.util.Random) r2
            r5.mRandom = r2
            android.os.Bundle r2 = r5.mPendingResults
            java.lang.String r3 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            android.os.Bundle r6 = r6.getBundle(r3)
            r2.putAll(r6)
            r6 = 0
        L32:
            int r2 = r1.size()
            if (r6 >= r2) goto L71
            java.lang.Object r2 = r1.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.mKeyToRc
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L5b
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r5.mKeyToRc
            java.lang.Object r3 = r3.remove(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            android.os.Bundle r4 = r5.mPendingResults
            boolean r2 = r4.containsKey(r2)
            if (r2 != 0) goto L5b
            java.util.Map<java.lang.Integer, java.lang.String> r2 = r5.mRcToKey
            r2.remove(r3)
        L5b:
            java.lang.Object r2 = r0.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r1.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r5.bindRcKey(r2, r3)
            int r6 = r6 + 1
            goto L32
        L71:
            return
    }

    public final void onSaveInstanceState(@androidx.annotation.NonNull android.os.Bundle r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.mKeyToRc
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"
            r3.putIntegerArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.mKeyToRc
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"
            r3.putStringArrayList(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList<java.lang.String> r1 = r2.mLaunchedKeys
            r0.<init>(r1)
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"
            r3.putStringArrayList(r1, r0)
            android.os.Bundle r0 = r2.mPendingResults
            java.lang.Object r0 = r0.clone()
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"
            r3.putBundle(r1, r0)
            java.util.Random r0 = r2.mRandom
            java.lang.String r1 = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT"
            r3.putSerializable(r1, r0)
            return
    }

    @androidx.annotation.NonNull
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r4, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r5) {
            r2 = this;
            r2.registerKey(r3)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r2.mKeyToCallback
            androidx.activity.result.ActivityResultRegistry$CallbackAndContract r1 = new androidx.activity.result.ActivityResultRegistry$CallbackAndContract
            r1.<init>(r5, r4)
            r0.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mParsedPendingResults
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L23
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.mParsedPendingResults
            java.lang.Object r0 = r0.get(r3)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.mParsedPendingResults
            r1.remove(r3)
            r5.onActivityResult(r0)
        L23:
            android.os.Bundle r0 = r2.mPendingResults
            android.os.Parcelable r0 = r0.getParcelable(r3)
            androidx.activity.result.ActivityResult r0 = (androidx.activity.result.ActivityResult) r0
            if (r0 == 0) goto L41
            android.os.Bundle r1 = r2.mPendingResults
            r1.remove(r3)
            int r1 = r0.getResultCode()
            android.content.Intent r0 = r0.getData()
            java.lang.Object r0 = r4.parseResult(r1, r0)
            r5.onActivityResult(r0)
        L41:
            androidx.activity.result.ActivityResultRegistry$3 r5 = new androidx.activity.result.ActivityResultRegistry$3
            r5.<init>(r2, r3, r4)
            return r5
    }

    @androidx.annotation.NonNull
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> register(@androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull androidx.lifecycle.LifecycleOwner r5, @androidx.annotation.NonNull androidx.activity.result.contract.ActivityResultContract<I, O> r6, @androidx.annotation.NonNull androidx.activity.result.ActivityResultCallback<O> r7) {
            r3 = this;
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 != 0) goto L35
            r3.registerKey(r4)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r5 = r3.mKeyToLifecycleContainers
            java.lang.Object r5 = r5.get(r4)
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r5 = (androidx.activity.result.ActivityResultRegistry.LifecycleContainer) r5
            if (r5 != 0) goto L22
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r5 = new androidx.activity.result.ActivityResultRegistry$LifecycleContainer
            r5.<init>(r0)
        L22:
            androidx.activity.result.ActivityResultRegistry$1 r0 = new androidx.activity.result.ActivityResultRegistry$1
            r0.<init>(r3, r4, r7, r6)
            r5.addObserver(r0)
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r7 = r3.mKeyToLifecycleContainers
            r7.put(r4, r5)
            androidx.activity.result.ActivityResultRegistry$2 r5 = new androidx.activity.result.ActivityResultRegistry$2
            r5.<init>(r3, r4, r6)
            return r5
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "LifecycleOwner "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = " is attempting to register while current state is "
            r6.append(r5)
            androidx.lifecycle.Lifecycle$State r5 = r0.getCurrentState()
            r6.append(r5)
            java.lang.String r5 = ". LifecycleOwners must call register before they are STARTED."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    @androidx.annotation.MainThread
    public final void unregister(@androidx.annotation.NonNull java.lang.String r6) {
            r5 = this;
            java.util.ArrayList<java.lang.String> r0 = r5.mLaunchedKeys
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L17
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.mKeyToRc
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L17
            java.util.Map<java.lang.Integer, java.lang.String> r1 = r5.mRcToKey
            r1.remove(r0)
        L17:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$CallbackAndContract<?>> r0 = r5.mKeyToCallback
            r0.remove(r6)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.mParsedPendingResults
            boolean r0 = r0.containsKey(r6)
            java.lang.String r1 = ": "
            java.lang.String r2 = "Dropping pending result for request "
            java.lang.String r3 = "ActivityResultRegistry"
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r6, r1)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.mParsedPendingResults
            java.lang.Object r4 = r4.get(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.mParsedPendingResults
            r0.remove(r6)
        L43:
            android.os.Bundle r0 = r5.mPendingResults
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r6, r1)
            android.os.Bundle r1 = r5.mPendingResults
            android.os.Parcelable r1 = r1.getParcelable(r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            android.os.Bundle r0 = r5.mPendingResults
            r0.remove(r6)
        L64:
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r0 = r5.mKeyToLifecycleContainers
            java.lang.Object r0 = r0.get(r6)
            androidx.activity.result.ActivityResultRegistry$LifecycleContainer r0 = (androidx.activity.result.ActivityResultRegistry.LifecycleContainer) r0
            if (r0 == 0) goto L76
            r0.clearObservers()
            java.util.Map<java.lang.String, androidx.activity.result.ActivityResultRegistry$LifecycleContainer> r0 = r5.mKeyToLifecycleContainers
            r0.remove(r6)
        L76:
            return
    }
}
