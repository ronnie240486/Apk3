package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandle.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002*+B\u001d\b\u0016\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002J\u001e\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010\u001bJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u0002H\u0016H\u0002¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00160 \"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u0002H\u0016H\u0007¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#H\u0007J\u001d\u0010$\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0017J\b\u0010\r\u001a\u00020\u000eH\u0007J&\u0010%\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u0001H\u0016H\u0087\u0002¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u000eH\u0007R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "initialState", "", "", "(Ljava/util/Map;)V", "()V", "flows", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "liveDatas", "Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "regular", "savedStateProvider", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateProviders", "clearSavedStateProvider", "", "key", "contains", "", "get", "T", "(Ljava/lang/String;)Ljava/lang/Object;", "getLiveData", "Landroidx/lifecycle/MutableLiveData;", "initialValue", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getLiveDataInternal", "hasInitialValue", "(Ljava/lang/String;ZLjava/lang/Object;)Landroidx/lifecycle/MutableLiveData;", "getStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "keys", "", "remove", "set", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "setSavedStateProvider", "provider", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SavedStateHandle {

    @org.jetbrains.annotations.NotNull
    private static final java.lang.Class<? extends java.lang.Object>[] ACCEPTABLE_CLASSES = null;

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandle.Companion Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String KEYS = "keys";

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VALUES = "values";

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> flows;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle.SavingStateLiveData<?>> liveDatas;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.Object> regular;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> savedStateProviders;

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0007R \u0010\u0003\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "()V", "ACCEPTABLE_CLASSES", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "KEYS", "", "VALUES", "createHandle", "Landroidx/lifecycle/SavedStateHandle;", "restoredState", "Landroid/os/Bundle;", "defaultState", "validateValue", "", "value", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.SavedStateHandle createHandle(@org.jetbrains.annotations.Nullable android.os.Bundle r6, @org.jetbrains.annotations.Nullable android.os.Bundle r7) {
                r5 = this;
                if (r6 != 0) goto L37
                if (r7 != 0) goto La
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>()
                goto L36
            La:
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                java.util.Set r0 = r7.keySet()
                java.util.Iterator r0 = r0.iterator()
            L17:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r2 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.Object r2 = r7.get(r1)
                r6.put(r1, r2)
                goto L17
            L30:
                androidx.lifecycle.SavedStateHandle r7 = new androidx.lifecycle.SavedStateHandle
                r7.<init>(r6)
                r6 = r7
            L36:
                return r6
            L37:
                java.lang.String r7 = "keys"
                java.util.ArrayList r7 = r6.getParcelableArrayList(r7)
                java.lang.String r0 = "values"
                java.util.ArrayList r6 = r6.getParcelableArrayList(r0)
                r0 = 0
                if (r7 == 0) goto L55
                if (r6 == 0) goto L55
                int r1 = r7.size()
                int r2 = r6.size()
                if (r1 != r2) goto L55
                r1 = 1
                goto L56
            L55:
                r1 = 0
            L56:
                if (r1 == 0) goto L7e
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                int r2 = r7.size()
            L61:
                if (r0 >= r2) goto L78
                java.lang.Object r3 = r7.get(r0)
                java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
                java.util.Objects.requireNonNull(r3, r4)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r6.get(r0)
                r1.put(r3, r4)
                int r0 = r0 + 1
                goto L61
            L78:
                androidx.lifecycle.SavedStateHandle r6 = new androidx.lifecycle.SavedStateHandle
                r6.<init>(r1)
                return r6
            L7e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "Invalid bundle passed as restored state"
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean validateValue(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r7 != 0) goto L4
                return r0
            L4:
                java.lang.Class[] r1 = androidx.lifecycle.SavedStateHandle.access$getACCEPTABLE_CLASSES$cp()
                int r2 = r1.length
                r3 = 0
                r4 = 0
            Lb:
                if (r4 >= r2) goto L1c
                r5 = r1[r4]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
                boolean r5 = r5.isInstance(r7)
                if (r5 == 0) goto L19
                return r0
            L19:
                int r4 = r4 + 1
                goto Lb
            L1c:
                return r3
        }
    }

    /* JADX INFO: compiled from: SavedStateHandle.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "value", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;)V", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;)V", "detach", "", "setValue", "(Ljava/lang/Object;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SavingStateLiveData<T> extends androidx.lifecycle.MutableLiveData<T> {

        @org.jetbrains.annotations.Nullable
        private androidx.lifecycle.SavedStateHandle handle;

        @org.jetbrains.annotations.NotNull
        private java.lang.String key;

        public SavingStateLiveData(@org.jetbrains.annotations.Nullable androidx.lifecycle.SavedStateHandle r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.key = r3
                r1.handle = r2
                return
        }

        public SavingStateLiveData(@org.jetbrains.annotations.Nullable androidx.lifecycle.SavedStateHandle r2, @org.jetbrains.annotations.NotNull java.lang.String r3, T r4) {
                r1 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>(r4)
                r1.key = r3
                r1.handle = r2
                return
        }

        public final void detach() {
                r1 = this;
                r0 = 0
                r1.handle = r0
                return
        }

        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public void setValue(T r4) {
                r3 = this;
                androidx.lifecycle.SavedStateHandle r0 = r3.handle
                if (r0 == 0) goto L1f
                java.util.Map r1 = androidx.lifecycle.SavedStateHandle.access$getRegular$p(r0)
                java.lang.String r2 = r3.key
                r1.put(r2, r4)
                java.util.Map r0 = androidx.lifecycle.SavedStateHandle.access$getFlows$p(r0)
                java.lang.String r1 = r3.key
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
                if (r0 != 0) goto L1c
                goto L1f
            L1c:
                r0.setValue(r4)
            L1f:
                super.setValue(r4)
                return
        }
    }

    public static /* synthetic */ android.os.Bundle $r8$lambda$85q68529u9GpNelrug3JBSyWf4c(androidx.lifecycle.SavedStateHandle r0) {
            android.os.Bundle r0 = m41savedStateProvider$lambda0(r0)
            return r0
    }

    static {
            androidx.lifecycle.SavedStateHandle$Companion r0 = new androidx.lifecycle.SavedStateHandle$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.SavedStateHandle.Companion = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r1 = 5
            java.lang.Class<int[]> r2 = int[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Long.TYPE
            r2 = 6
            r0[r2] = r1
            r1 = 7
            java.lang.Class<long[]> r2 = long[].class
            r0[r1] = r2
            r1 = 8
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r1 = 9
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r0[r1] = r2
            r1 = 10
            java.lang.Class<android.os.Binder> r2 = android.os.Binder.class
            r0[r1] = r2
            r1 = 11
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Byte.TYPE
            r2 = 12
            r0[r2] = r1
            r1 = 13
            java.lang.Class<byte[]> r2 = byte[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Character.TYPE
            r2 = 14
            r0[r2] = r1
            r1 = 15
            java.lang.Class<char[]> r2 = char[].class
            r0[r1] = r2
            r1 = 16
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0[r1] = r2
            r1 = 17
            java.lang.Class<java.lang.CharSequence[]> r2 = java.lang.CharSequence[].class
            r0[r1] = r2
            r1 = 18
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Float.TYPE
            r2 = 19
            r0[r2] = r1
            r1 = 20
            java.lang.Class<float[]> r2 = float[].class
            r0[r1] = r2
            r1 = 21
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r0[r1] = r2
            r1 = 22
            java.lang.Class<android.os.Parcelable[]> r2 = android.os.Parcelable[].class
            r0[r1] = r2
            r1 = 23
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Short.TYPE
            r2 = 24
            r0[r2] = r1
            r1 = 25
            java.lang.Class<short[]> r2 = short[].class
            r0[r1] = r2
            r1 = 26
            java.lang.Class<android.util.SparseArray> r2 = android.util.SparseArray.class
            r0[r1] = r2
            java.lang.Class<android.util.Size> r1 = android.util.Size.class
            r2 = 27
            r0[r2] = r1
            r1 = 28
            java.lang.Class<android.util.SizeF> r2 = android.util.SizeF.class
            r0[r1] = r2
            androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES = r0
            return
    }

    public SavedStateHandle() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.regular = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.savedStateProviders = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.liveDatas = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.flows = r0
            androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0 r0 = new androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r2, r1)
            r2.savedStateProvider = r0
            return
    }

    public SavedStateHandle(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "initialState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.regular = r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.savedStateProviders = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.liveDatas = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r3.flows = r1
            androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0 r1 = new androidx.lifecycle.SavedStateHandle$$ExternalSyntheticLambda0
            r2 = 0
            r1.<init>(r3, r2)
            r3.savedStateProvider = r1
            r0.putAll(r4)
            return
    }

    public static final /* synthetic */ java.lang.Class[] access$getACCEPTABLE_CLASSES$cp() {
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.SavedStateHandle.ACCEPTABLE_CLASSES
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getFlows$p(androidx.lifecycle.SavedStateHandle r0) {
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r0 = r0.flows
            return r0
    }

    public static final /* synthetic */ java.util.Map access$getRegular$p(androidx.lifecycle.SavedStateHandle r0) {
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.regular
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.SavedStateHandle createHandle(@org.jetbrains.annotations.Nullable android.os.Bundle r1, @org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r1 = r0.createHandle(r1, r2)
            return r1
    }

    private final <T> androidx.lifecycle.MutableLiveData<T> getLiveDataInternal(java.lang.String r3, boolean r4, T r5) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto Ld
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L11
            return r0
        L11:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L25
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.regular
            java.lang.Object r5 = r5.get(r3)
            r4.<init>(r2, r3, r5)
            goto L37
        L25:
            if (r4 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.regular
            r4.put(r3, r5)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r4.<init>(r2, r3, r5)
            goto L37
        L32:
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r4 = new androidx.lifecycle.SavedStateHandle$SavingStateLiveData
            r4.<init>(r2, r3)
        L37:
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r5 = r2.liveDatas
            r5.put(r3, r4)
            return r4
    }

    /* JADX INFO: renamed from: savedStateProvider$lambda-0, reason: not valid java name */
    private static final android.os.Bundle m41savedStateProvider$lambda0(androidx.lifecycle.SavedStateHandle r5) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r5.savedStateProviders
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
            android.os.Bundle r1 = r1.saveState()
            r5.set(r2, r1)
            goto L14
        L34:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.regular
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L69
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.add(r3)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.regular
            java.lang.Object r3 = r4.get(r3)
            r2.add(r3)
            goto L50
        L69:
            r5 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            r0 = 0
            java.lang.String r3 = "keys"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r3, r1)
            r5[r0] = r1
            r0 = 1
            java.lang.String r1 = "values"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            r5[r0] = r1
            android.os.Bundle r5 = androidx.core.os.BundleKt.bundleOf(r5)
            return r5
    }

    @androidx.annotation.MainThread
    public final void clearSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.savedStateProviders
            r0.remove(r2)
            return
    }

    @androidx.annotation.MainThread
    public final boolean contains(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.Nullable
    public final <T> T get(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.regular
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 0
            androidx.lifecycle.MutableLiveData r3 = r2.getLiveDataInternal(r3, r0, r1)
            return r3
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final <T> androidx.lifecycle.MutableLiveData<T> getLiveData(@org.jetbrains.annotations.NotNull java.lang.String r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            androidx.lifecycle.MutableLiveData r2 = r1.getLiveDataInternal(r2, r0, r3)
            return r2
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final <T> kotlinx.coroutines.flow.StateFlow<T> getStateFlow(@org.jetbrains.annotations.NotNull java.lang.String r3, T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r0 = r2.flows
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L2c
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.regular
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L1a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.regular
            r1.put(r3, r4)
        L1a:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.regular
            java.lang.Object r4 = r4.get(r3)
            kotlinx.coroutines.flow.MutableStateFlow r1 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r4)
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r4 = r2.flows
            r4.put(r3, r1)
            r0.put(r3, r1)
        L2c:
            kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
            kotlinx.coroutines.flow.StateFlow r3 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r1)
            return r3
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> keys() {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.util.Set r0 = r0.keySet()
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r2.savedStateProviders
            java.util.Set r1 = r1.keySet()
            java.util.Set r0 = kotlin.collections.SetsKt.plus(r0, r1)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.util.Set r1 = r1.keySet()
            java.util.Set r0 = kotlin.collections.SetsKt.plus(r0, r1)
            return r0
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.Nullable
    public final <T> T remove(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            java.lang.Object r0 = r0.remove(r3)
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r1 = r2.liveDatas
            java.lang.Object r1 = r1.remove(r3)
            androidx.lifecycle.SavedStateHandle$SavingStateLiveData r1 = (androidx.lifecycle.SavedStateHandle.SavingStateLiveData) r1
            if (r1 == 0) goto L18
            r1.detach()
        L18:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r1 = r2.flows
            r1.remove(r3)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider() {
            r1 = this;
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r1.savedStateProvider
            return r0
    }

    @androidx.annotation.MainThread
    public final <T> void set(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable T r4) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.SavedStateHandle$Companion r0 = androidx.lifecycle.SavedStateHandle.Companion
            boolean r0 = r0.validateValue(r4)
            if (r0 == 0) goto L35
            java.util.Map<java.lang.String, androidx.lifecycle.SavedStateHandle$SavingStateLiveData<?>> r0 = r2.liveDatas
            java.lang.Object r0 = r0.get(r3)
            boolean r1 = r0 instanceof androidx.lifecycle.MutableLiveData
            if (r1 == 0) goto L1a
            androidx.lifecycle.MutableLiveData r0 = (androidx.lifecycle.MutableLiveData) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L21
            r0.setValue(r4)
            goto L26
        L21:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.regular
            r0.put(r3, r4)
        L26:
            java.util.Map<java.lang.String, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Object>> r0 = r2.flows
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.flow.MutableStateFlow r3 = (kotlinx.coroutines.flow.MutableStateFlow) r3
            if (r3 != 0) goto L31
            goto L34
        L31:
            r3.setValue(r4)
        L34:
            return
        L35:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't put value with type "
            r0.append(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Class r4 = r4.getClass()
            r0.append(r4)
            java.lang.String r4 = " into saved state"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.MainThread
    public final void setSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Map<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.savedStateProviders
            r0.put(r2, r3)
            return
    }
}
