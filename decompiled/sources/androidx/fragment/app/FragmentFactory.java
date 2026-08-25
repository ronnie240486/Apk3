package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentFactory {
    private static final androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> sClassCacheMap = null;

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.fragment.app.FragmentFactory.sClassCacheMap = r0
            return
    }

    public FragmentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isFragmentClass(@androidx.annotation.NonNull java.lang.ClassLoader r0, @androidx.annotation.NonNull java.lang.String r1) {
            java.lang.Class r0 = loadClass(r0, r1)     // Catch: java.lang.ClassNotFoundException -> Lb
            java.lang.Class<androidx.fragment.app.Fragment> r1 = androidx.fragment.app.Fragment.class
            boolean r0 = r1.isAssignableFrom(r0)     // Catch: java.lang.ClassNotFoundException -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @androidx.annotation.NonNull
    private static java.lang.Class<?> loadClass(@androidx.annotation.NonNull java.lang.ClassLoader r2, @androidx.annotation.NonNull java.lang.String r3) throws java.lang.ClassNotFoundException {
            androidx.collection.SimpleArrayMap<java.lang.ClassLoader, androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Class<?>>> r0 = androidx.fragment.app.FragmentFactory.sClassCacheMap
            java.lang.Object r1 = r0.get(r2)
            androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
            if (r1 != 0) goto L12
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r0.put(r2, r1)
        L12:
            java.lang.Object r0 = r1.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L22
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r2)
            r1.put(r3, r0)
        L22:
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.Class<? extends androidx.fragment.app.Fragment> loadFragmentClass(@androidx.annotation.NonNull java.lang.ClassLoader r3, @androidx.annotation.NonNull java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = loadClass(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L14
            return r3
        L7:
            r3 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r1 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r2 = ": make sure class is a valid subclass of Fragment"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
        L14:
            r3 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r1 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r2 = ": make sure class name exists"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
    }

    @androidx.annotation.NonNull
    public androidx.fragment.app.Fragment instantiate(@androidx.annotation.NonNull java.lang.ClassLoader r5, @androidx.annotation.NonNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.Class r5 = loadFragmentClass(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L25 java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L3d
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L25 java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L3d
            java.lang.reflect.Constructor r5 = r5.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L25 java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L3d
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L25 java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L3d
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L25 java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L3d
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.NoSuchMethodException -> L25 java.lang.IllegalAccessException -> L32 java.lang.InstantiationException -> L3d
            return r5
        L18:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r2 = ": calling Fragment constructor caused an exception"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r2)
            r0.<init>(r6, r5)
            throw r0
        L25:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r0 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r2 = ": could not find Fragment constructor"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r2)
            r0.<init>(r6, r5)
            throw r0
        L32:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r0)
            r2.<init>(r6, r5)
            throw r2
        L3d:
            r5 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r0)
            r2.<init>(r6, r5)
            throw r2
    }
}
