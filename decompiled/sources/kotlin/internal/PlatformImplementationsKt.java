package kotlin.internal;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0001\u001a\"\u0010\b\u001a\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\u001a\b\u0010\r\u001a\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PlatformImplementationsKt {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlin.internal.PlatformImplementations IMPLEMENTATIONS = null;

    static {
            java.lang.Class<kotlin.internal.PlatformImplementations> r0 = kotlin.internal.PlatformImplementations.class
            int r1 = getJavaVersion()
            r2 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r3 = ", base type classloader: "
            java.lang.String r4 = "Instance class was loaded from a different classloader: "
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.internal.PlatformImplementations"
            java.lang.String r6 = "forName(\"kotlin.internal…entations\").newInstance()"
            r7 = 65544(0x10008, float:9.1847E-41)
            if (r1 >= r7) goto L17
            if (r1 >= r2) goto La6
        L17:
            java.lang.Class<kotlin.internal.jdk8.JDK8PlatformImplementations> r7 = kotlin.internal.jdk8.JDK8PlatformImplementations.class
            java.lang.Object r7 = r7.newInstance()     // Catch: java.lang.ClassNotFoundException -> L5c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)     // Catch: java.lang.ClassNotFoundException -> L5c
            if (r7 == 0) goto L28
            kotlin.internal.PlatformImplementations r7 = (kotlin.internal.PlatformImplementations) r7     // Catch: java.lang.ClassCastException -> L26 java.lang.ClassNotFoundException -> L5c
            goto L141
        L26:
            r8 = move-exception
            goto L2e
        L28:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> L26 java.lang.ClassNotFoundException -> L5c
            r8.<init>(r5)     // Catch: java.lang.ClassCastException -> L26 java.lang.ClassNotFoundException -> L5c
            throw r8     // Catch: java.lang.ClassCastException -> L26 java.lang.ClassNotFoundException -> L5c
        L2e:
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L5c
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r9)     // Catch: java.lang.ClassNotFoundException -> L5c
            if (r10 != 0) goto L5b
            java.lang.ClassNotFoundException r10 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L5c
            r11.<init>()     // Catch: java.lang.ClassNotFoundException -> L5c
            r11.append(r4)     // Catch: java.lang.ClassNotFoundException -> L5c
            r11.append(r7)     // Catch: java.lang.ClassNotFoundException -> L5c
            r11.append(r3)     // Catch: java.lang.ClassNotFoundException -> L5c
            r11.append(r9)     // Catch: java.lang.ClassNotFoundException -> L5c
            java.lang.String r7 = r11.toString()     // Catch: java.lang.ClassNotFoundException -> L5c
            r10.<init>(r7, r8)     // Catch: java.lang.ClassNotFoundException -> L5c
            throw r10     // Catch: java.lang.ClassNotFoundException -> L5c
        L5b:
            throw r8     // Catch: java.lang.ClassNotFoundException -> L5c
        L5c:
            java.lang.String r7 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.ClassNotFoundException -> La5
            java.lang.Object r7 = r7.newInstance()     // Catch: java.lang.ClassNotFoundException -> La5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)     // Catch: java.lang.ClassNotFoundException -> La5
            if (r7 == 0) goto L71
            kotlin.internal.PlatformImplementations r7 = (kotlin.internal.PlatformImplementations) r7     // Catch: java.lang.ClassCastException -> L6f java.lang.ClassNotFoundException -> La5
            goto L141
        L6f:
            r8 = move-exception
            goto L77
        L71:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> L6f java.lang.ClassNotFoundException -> La5
            r8.<init>(r5)     // Catch: java.lang.ClassCastException -> L6f java.lang.ClassNotFoundException -> La5
            throw r8     // Catch: java.lang.ClassCastException -> L6f java.lang.ClassNotFoundException -> La5
        L77:
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.ClassNotFoundException -> La5
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> La5
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> La5
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r9)     // Catch: java.lang.ClassNotFoundException -> La5
            if (r10 != 0) goto La4
            java.lang.ClassNotFoundException r10 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> La5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> La5
            r11.<init>()     // Catch: java.lang.ClassNotFoundException -> La5
            r11.append(r4)     // Catch: java.lang.ClassNotFoundException -> La5
            r11.append(r7)     // Catch: java.lang.ClassNotFoundException -> La5
            r11.append(r3)     // Catch: java.lang.ClassNotFoundException -> La5
            r11.append(r9)     // Catch: java.lang.ClassNotFoundException -> La5
            java.lang.String r7 = r11.toString()     // Catch: java.lang.ClassNotFoundException -> La5
            r10.<init>(r7, r8)     // Catch: java.lang.ClassNotFoundException -> La5
            throw r10     // Catch: java.lang.ClassNotFoundException -> La5
        La4:
            throw r8     // Catch: java.lang.ClassNotFoundException -> La5
        La5:
        La6:
            r7 = 65543(0x10007, float:9.1845E-41)
            if (r1 >= r7) goto Lad
            if (r1 >= r2) goto L13c
        Lad:
            java.lang.Class<kotlin.internal.jdk7.JDK7PlatformImplementations> r1 = kotlin.internal.jdk7.JDK7PlatformImplementations.class
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.ClassNotFoundException -> Lf3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)     // Catch: java.lang.ClassNotFoundException -> Lf3
            if (r1 == 0) goto Lbf
            r7 = r1
            kotlin.internal.PlatformImplementations r7 = (kotlin.internal.PlatformImplementations) r7     // Catch: java.lang.ClassCastException -> Lbd java.lang.ClassNotFoundException -> Lf3
            goto L141
        Lbd:
            r2 = move-exception
            goto Lc5
        Lbf:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> Lbd java.lang.ClassNotFoundException -> Lf3
            r2.<init>(r5)     // Catch: java.lang.ClassCastException -> Lbd java.lang.ClassNotFoundException -> Lf3
            throw r2     // Catch: java.lang.ClassCastException -> Lbd java.lang.ClassNotFoundException -> Lf3
        Lc5:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> Lf3
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Lf3
            java.lang.ClassLoader r7 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Lf3
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r7)     // Catch: java.lang.ClassNotFoundException -> Lf3
            if (r8 != 0) goto Lf2
            java.lang.ClassNotFoundException r8 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> Lf3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> Lf3
            r9.<init>()     // Catch: java.lang.ClassNotFoundException -> Lf3
            r9.append(r4)     // Catch: java.lang.ClassNotFoundException -> Lf3
            r9.append(r1)     // Catch: java.lang.ClassNotFoundException -> Lf3
            r9.append(r3)     // Catch: java.lang.ClassNotFoundException -> Lf3
            r9.append(r7)     // Catch: java.lang.ClassNotFoundException -> Lf3
            java.lang.String r1 = r9.toString()     // Catch: java.lang.ClassNotFoundException -> Lf3
            r8.<init>(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Lf3
            throw r8     // Catch: java.lang.ClassNotFoundException -> Lf3
        Lf2:
            throw r2     // Catch: java.lang.ClassNotFoundException -> Lf3
        Lf3:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L13c
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.ClassNotFoundException -> L13c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)     // Catch: java.lang.ClassNotFoundException -> L13c
            if (r1 == 0) goto L108
            r7 = r1
            kotlin.internal.PlatformImplementations r7 = (kotlin.internal.PlatformImplementations) r7     // Catch: java.lang.ClassCastException -> L106 java.lang.ClassNotFoundException -> L13c
            goto L141
        L106:
            r2 = move-exception
            goto L10e
        L108:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.ClassCastException -> L106 java.lang.ClassNotFoundException -> L13c
            r2.<init>(r5)     // Catch: java.lang.ClassCastException -> L106 java.lang.ClassNotFoundException -> L13c
            throw r2     // Catch: java.lang.ClassCastException -> L106 java.lang.ClassNotFoundException -> L13c
        L10e:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.ClassNotFoundException -> L13c
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L13c
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L13c
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)     // Catch: java.lang.ClassNotFoundException -> L13c
            if (r5 != 0) goto L13b
            java.lang.ClassNotFoundException r5 = new java.lang.ClassNotFoundException     // Catch: java.lang.ClassNotFoundException -> L13c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L13c
            r6.<init>()     // Catch: java.lang.ClassNotFoundException -> L13c
            r6.append(r4)     // Catch: java.lang.ClassNotFoundException -> L13c
            r6.append(r1)     // Catch: java.lang.ClassNotFoundException -> L13c
            r6.append(r3)     // Catch: java.lang.ClassNotFoundException -> L13c
            r6.append(r0)     // Catch: java.lang.ClassNotFoundException -> L13c
            java.lang.String r0 = r6.toString()     // Catch: java.lang.ClassNotFoundException -> L13c
            r5.<init>(r0, r2)     // Catch: java.lang.ClassNotFoundException -> L13c
            throw r5     // Catch: java.lang.ClassNotFoundException -> L13c
        L13b:
            throw r2     // Catch: java.lang.ClassNotFoundException -> L13c
        L13c:
            kotlin.internal.PlatformImplementations r7 = new kotlin.internal.PlatformImplementations
            r7.<init>()
        L141:
            kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS = r7
            return
    }

    @kotlin.SinceKotlin(version = "1.2")
    @kotlin.PublishedApi
    public static final boolean apiVersionIsAtLeast(int r1, int r2, int r3) {
            kotlin.KotlinVersion r0 = kotlin.KotlinVersion.CURRENT
            boolean r1 = r0.isAtLeast(r1, r2, r3)
            return r1
    }

    @kotlin.internal.InlineOnly
    private static final /* synthetic */ <T> T castToBaseType(java.lang.Object r5) {
            java.lang.String r0 = "T"
            r1 = 1
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r0)     // Catch: java.lang.ClassCastException -> L7
            return r5
        L7:
            r1 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r2 = 4
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r2, r0)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r2 != 0) goto L3f
            java.lang.ClassNotFoundException r2 = new java.lang.ClassNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Instance class was loaded from a different classloader: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r5 = ", base type classloader: "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5, r1)
            throw r2
        L3f:
            throw r1
    }

    private static final int getJavaVersion() {
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 65542(0x10006, float:9.1844E-41)
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r2 = 6
            r3 = 46
            r4 = 0
            int r2 = kotlin.text.StringsKt.indexOf$default(r0, r3, r4, r2)
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= 0) goto L1f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L1e
            int r1 = r0 * r5
        L1e:
            return r1
        L1f:
            int r6 = r2 + 1
            r7 = 4
            int r3 = kotlin.text.StringsKt.indexOf$default(r0, r3, r6, r7)
            if (r3 >= 0) goto L2c
            int r3 = r0.length()
        L2c:
            java.lang.String r2 = r0.substring(r4, r2)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r0 = r0.substring(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L49
            int r2 = r2 * r5
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L49
            int r1 = r2 + r0
        L49:
            return r1
    }
}
