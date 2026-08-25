package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", "name", "loader", "Ljava/lang/ClassLoader;", "service", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FastServiceLoader {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.FastServiceLoader INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PREFIX = "META-INF/services/";

    static {
            kotlinx.coroutines.internal.FastServiceLoader r0 = new kotlinx.coroutines.internal.FastServiceLoader
            r0.<init>()
            kotlinx.coroutines.internal.FastServiceLoader.INSTANCE = r0
            return
    }

    private FastServiceLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.internal.MainDispatcherFactory createInstanceOf(java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r3, java.lang.String r4) {
            r2 = this;
            r0 = 1
            java.lang.ClassLoader r1 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Class r4 = java.lang.Class.forName(r4, r0, r1)     // Catch: java.lang.ClassNotFoundException -> L1d
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r4 = r4.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L1d
            java.lang.Object r3 = r3.cast(r4)     // Catch: java.lang.ClassNotFoundException -> L1d
            kotlinx.coroutines.internal.MainDispatcherFactory r3 = (kotlinx.coroutines.internal.MainDispatcherFactory) r3     // Catch: java.lang.ClassNotFoundException -> L1d
            goto L1e
        L1d:
            r3 = 0
        L1e:
            return r3
    }

    private final <S> S getProviderInstance(java.lang.String r2, java.lang.ClassLoader r3, java.lang.Class<S> r4) {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
            boolean r3 = r4.isAssignableFrom(r2)
            if (r3 == 0) goto L1c
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Object r2 = r2.newInstance(r3)
            java.lang.Object r2 = r4.cast(r2)
            return r2
        L1c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected service of class "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = ", but found "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final <S> java.util.List<S> load(java.lang.Class<S> r1, java.lang.ClassLoader r2) {
            r0 = this;
            java.util.List r1 = r0.loadProviders$kotlinx_coroutines_core(r1, r2)     // Catch: java.lang.Throwable -> L5
            goto Ld
        L5:
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r1)
        Ld:
            return r1
    }

    private final java.util.List<java.lang.String> parse(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1)
            r2 = 0
            if (r1 == 0) goto L5a
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.text.StringsKt.substringAfter$default(r0, r6)
            java.lang.String r6 = kotlin.text.StringsKt.substringBefore$default(r6)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.text.StringsKt.substringAfter$default(r0, r1)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r3 = 0
            r1.<init>(r6, r3)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L4e
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            java.io.InputStream r0 = r1.getInputStream(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = "UTF-8"
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L4e
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            kotlinx.coroutines.internal.FastServiceLoader r0 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L47
            java.util.List r0 = r0.parseFile(r6)     // Catch: java.lang.Throwable -> L47
            kotlin.io.CloseableKt.closeFinally(r6, r2)     // Catch: java.lang.Throwable -> L4e
            r1.close()     // Catch: java.lang.Throwable -> L45
            return r0
        L45:
            r6 = move-exception
            throw r6
        L47:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r0)     // Catch: java.lang.Throwable -> L4e
            throw r2     // Catch: java.lang.Throwable -> L4e
        L4e:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L55
            throw r0
        L55:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r0)
            throw r6
        L5a:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.FastServiceLoader r6 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE     // Catch: java.lang.Throwable -> L72
            java.util.List r6 = r6.parseFile(r0)     // Catch: java.lang.Throwable -> L72
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return r6
        L72:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L74
        L74:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)
            throw r1
    }

    private final java.util.List<java.lang.String> parseFile(java.io.BufferedReader r8) {
            r7 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L5:
            java.lang.String r1 = r8.readLine()
            if (r1 != 0) goto L10
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r0)
            return r8
        L10:
            java.lang.String r1 = kotlin.text.StringsKt.substringBefore$default$1(r1)
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r3 = 0
        L1e:
            int r4 = r1.length()
            r5 = 1
            if (r3 >= r4) goto L3d
            char r4 = r1.charAt(r3)
            int r3 = r3 + 1
            r6 = 46
            if (r4 == r6) goto L38
            boolean r4 = java.lang.Character.isJavaIdentifierPart(r4)
            if (r4 == 0) goto L36
            goto L38
        L36:
            r4 = 0
            goto L39
        L38:
            r4 = 1
        L39:
            if (r4 != 0) goto L1e
            r3 = 0
            goto L3e
        L3d:
            r3 = 1
        L3e:
            if (r3 == 0) goto L4d
            int r3 = r1.length()
            if (r3 <= 0) goto L47
            r2 = 1
        L47:
            if (r2 == 0) goto L5
            r0.add(r1)
            goto L5
        L4d:
            java.lang.String r8 = "Illegal service provider class name: "
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r8, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    private final <R> R use(java.util.jar.JarFile r3, kotlin.jvm.functions.Function1<? super java.util.jar.JarFile, ? extends R> r4) {
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L11
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r3.close()     // Catch: java.lang.Throwable -> Lf
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            return r4
        Lf:
            r3 = move-exception
            throw r3
        L11:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L13
        L13:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r3.close()     // Catch: java.lang.Throwable -> L1e
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
        L1e:
            r3 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r4, r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlinx.coroutines.internal.MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
            r7 = this;
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r0 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            boolean r1 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()
            if (r1 != 0) goto L11
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r0 = r7.load(r0, r1)
            return r0
        L11:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r3 = 0
            r4 = 1
            r5 = 0
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            java.lang.Object r2 = r2.newInstance(r6)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L37 java.lang.Throwable -> L64
            goto L38
        L37:
            r2 = r3
        L38:
            if (r2 != 0) goto L3b
            goto L3e
        L3b:
            r1.add(r2)     // Catch: java.lang.Throwable -> L64
        L3e:
            java.lang.String r2 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r6)     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            java.lang.Object r2 = r0.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch: java.lang.ClassNotFoundException -> L5c java.lang.Throwable -> L64
            r3 = r2
            goto L5d
        L5c:
        L5d:
            if (r3 != 0) goto L60
            goto L6c
        L60:
            r1.add(r3)     // Catch: java.lang.Throwable -> L64
            goto L6c
        L64:
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.util.List r1 = r7.load(r0, r1)
        L6c:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final <S> java.util.List<S> loadProviders$kotlinx_coroutines_core(@org.jetbrains.annotations.NotNull java.lang.Class<S> r5, @org.jetbrains.annotations.NotNull java.lang.ClassLoader r6) {
            r4 = this;
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "META-INF/services/"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r0)
            java.util.Enumeration r0 = r6.getResources(r0)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r1 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.net.URL r2 = (java.net.URL) r2
            kotlinx.coroutines.internal.FastServiceLoader r3 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.util.List r2 = r3.parse(r2)
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            goto L20
        L36:
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r1)
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L66
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L4f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L65
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlinx.coroutines.internal.FastServiceLoader r3 = kotlinx.coroutines.internal.FastServiceLoader.INSTANCE
            java.lang.Object r2 = r3.getProviderInstance(r2, r6, r5)
            r1.add(r2)
            goto L4f
        L65:
            return r1
        L66:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No providers were loaded with FastServiceLoader"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
