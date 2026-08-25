package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0000\u001aI\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", "T", "modelClass", "signature", "newInstance", "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class SavedStateViewModelFactoryKt {

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.Class<?>> ANDROID_VIEWMODEL_SIGNATURE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.List<java.lang.Class<?>> VIEWMODEL_SIGNATURE = null;

    static {
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r0 = androidx.lifecycle.SavedStateHandle.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            java.lang.Class<android.app.Application> r3 = android.app.Application.class
            r1[r2] = r3
            r2 = 1
            r1[r2] = r0
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE = r0
            return
    }

    public static final /* synthetic */ java.util.List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE
            return r0
    }

    public static final /* synthetic */ java.util.List access$getVIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(@org.jetbrains.annotations.NotNull java.lang.Class<T> r6, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Class<?>> r7) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            java.lang.String r1 = "modelClass.constructors"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r1 = r0.length
            r2 = 0
        L16:
            if (r2 >= r1) goto L61
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "constructor.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.List r4 = kotlin.collections.ArraysKt.toList(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r4)
            if (r5 == 0) goto L2e
            return r3
        L2e:
            int r3 = r7.size()
            int r5 = r4.size()
            if (r3 != r5) goto L5e
            boolean r3 = r4.containsAll(r7)
            if (r3 != 0) goto L3f
            goto L5e
        L3f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Class "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r6 = r6.getSimpleName()
            r1.append(r6)
            java.lang.String r6 = " must have parameters in the proper order: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L5e:
            int r2 = r2 + 1
            goto L16
        L61:
            r6 = 0
            return r6
    }

    public static final <T extends androidx.lifecycle.ViewModel> T newInstance(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2, @org.jetbrains.annotations.NotNull java.lang.reflect.Constructor<T> r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            androidx.lifecycle.ViewModel r3 = (androidx.lifecycle.ViewModel) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L37 java.lang.IllegalAccessException -> L54
            return r3
        L1b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An exception happened in constructor of "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r2, r3)
            throw r4
        L37:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " cannot be instantiated."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
        L54:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
    }
}
