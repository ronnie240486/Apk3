package com.google.common.eventbus;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.eventbus.ElementTypesAreNonnullByDefault
final class SubscriberRegistry {
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>> flattenHierarchyCache = null;
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>> subscriberMethodsCache = null;

    @com.google.j2objc.annotations.Weak
    private final com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> subscribers;



    /* JADX INFO: loaded from: classes.dex */
    public static final class MethodIdentifier {
        private final java.lang.String name;
        private final java.util.List<java.lang.Class<?>> parameterTypes;

        public MethodIdentifier(java.lang.reflect.Method r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.getName()
                r1.name = r0
                java.lang.Class[] r2 = r2.getParameterTypes()
                java.util.List r2 = java.util.Arrays.asList(r2)
                r1.parameterTypes = r2
                return
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.common.eventbus.SubscriberRegistry.MethodIdentifier
                r1 = 0
                if (r0 == 0) goto L1c
                com.google.common.eventbus.SubscriberRegistry$MethodIdentifier r4 = (com.google.common.eventbus.SubscriberRegistry.MethodIdentifier) r4
                java.lang.String r0 = r3.name
                java.lang.String r2 = r4.name
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1c
                java.util.List<java.lang.Class<?>> r0 = r3.parameterTypes
                java.util.List<java.lang.Class<?>> r4 = r4.parameterTypes
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1c
                r1 = 1
            L1c:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r3.name
                r2 = 0
                r0[r2] = r1
                java.util.List<java.lang.Class<?>> r1 = r3.parameterTypes
                r2 = 1
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }
    }

    static {
            com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
            com.google.common.cache.CacheBuilder r0 = r0.weakKeys()
            com.google.common.eventbus.SubscriberRegistry$1 r1 = new com.google.common.eventbus.SubscriberRegistry$1
            r1.<init>()
            com.google.common.cache.LoadingCache r0 = r0.build(r1)
            com.google.common.eventbus.SubscriberRegistry.subscriberMethodsCache = r0
            com.google.common.cache.CacheBuilder r0 = com.google.common.cache.CacheBuilder.newBuilder()
            com.google.common.cache.CacheBuilder r0 = r0.weakKeys()
            com.google.common.eventbus.SubscriberRegistry$2 r1 = new com.google.common.eventbus.SubscriberRegistry$2
            r1.<init>()
            com.google.common.cache.LoadingCache r0 = r0.build(r1)
            com.google.common.eventbus.SubscriberRegistry.flattenHierarchyCache = r0
            return
    }

    public SubscriberRegistry(com.google.common.eventbus.EventBus r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentMap r0 = com.google.common.collect.Maps.newConcurrentMap()
            r1.subscribers = r0
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.eventbus.EventBus r2 = (com.google.common.eventbus.EventBus) r2
            r1.bus = r2
            return
    }

    public static /* synthetic */ com.google.common.collect.ImmutableList access$000(java.lang.Class r0) {
            com.google.common.collect.ImmutableList r0 = getAnnotatedMethodsNotCached(r0)
            return r0
    }

    private com.google.common.collect.Multimap<java.lang.Class<?>, com.google.common.eventbus.Subscriber> findAllSubscribers(java.lang.Object r6) {
            r5 = this;
            com.google.common.collect.HashMultimap r0 = com.google.common.collect.HashMultimap.create()
            java.lang.Class r1 = r6.getClass()
            com.google.common.collect.ImmutableList r1 = getAnnotatedMethods(r1)
            com.google.common.collect.UnmodifiableIterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            r4 = 0
            r3 = r3[r4]
            com.google.common.eventbus.EventBus r4 = r5.bus
            com.google.common.eventbus.Subscriber r2 = com.google.common.eventbus.Subscriber.create(r4, r6, r2)
            r0.put(r3, r2)
            goto L10
        L2d:
            return r0
    }

    private static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethods(java.lang.Class<?> r1) {
            com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>> r0 = com.google.common.eventbus.SubscriberRegistry.subscriberMethodsCache     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L9
            java.lang.Object r1 = r0.getUnchecked(r1)     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L9
            com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L9
            return r1
        L9:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            com.google.common.base.Throwables.throwIfUnchecked(r0)
            throw r1
    }

    private static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethodsNotCached(java.lang.Class<?> r11) {
            com.google.common.reflect.TypeToken r11 = com.google.common.reflect.TypeToken.of(r11)
            com.google.common.reflect.TypeToken$TypeSet r11 = r11.getTypes()
            java.util.Set r11 = r11.rawTypes()
            java.util.HashMap r0 = com.google.common.collect.Maps.newHashMap()
            java.util.Iterator r11 = r11.iterator()
        L14:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r11.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L27:
            if (r4 >= r2) goto L14
            r5 = r1[r4]
            java.lang.Class<com.google.common.eventbus.Subscribe> r6 = com.google.common.eventbus.Subscribe.class
            boolean r6 = r5.isAnnotationPresent(r6)
            if (r6 == 0) goto L74
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L74
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto L43
            r7 = 1
            goto L44
        L43:
            r7 = 0
        L44:
            int r9 = r6.length
            java.lang.String r10 = "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter."
            com.google.common.base.Preconditions.checkArgument(r7, r10, r5, r9)
            r7 = r6[r3]
            boolean r7 = r7.isPrimitive()
            r7 = r7 ^ r8
            r8 = r6[r3]
            java.lang.String r8 = r8.getName()
            r6 = r6[r3]
            java.lang.Class r6 = com.google.common.primitives.Primitives.wrap(r6)
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r9 = "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s."
            com.google.common.base.Preconditions.checkArgument(r7, r9, r5, r8, r6)
            com.google.common.eventbus.SubscriberRegistry$MethodIdentifier r6 = new com.google.common.eventbus.SubscriberRegistry$MethodIdentifier
            r6.<init>(r5)
            boolean r7 = r0.containsKey(r6)
            if (r7 != 0) goto L74
            r0.put(r6, r5)
        L74:
            int r4 = r4 + 1
            goto L27
        L77:
            java.util.Collection r11 = r0.values()
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.copyOf(r11)
            return r11
    }

    public final java.util.Iterator<com.google.common.eventbus.Subscriber> getSubscribers(java.lang.Object r4) {
            r3 = this;
            java.lang.Class r4 = r4.getClass()
            com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>> r0 = com.google.common.eventbus.SubscriberRegistry.flattenHierarchyCache     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L3f
            java.lang.Object r4 = r0.getUnchecked(r4)     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L3f
            com.google.common.collect.ImmutableSet r4 = (com.google.common.collect.ImmutableSet) r4     // Catch: com.google.common.util.concurrent.UncheckedExecutionException -> L3f
            int r0 = r4.size()
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayListWithCapacity(r0)
            com.google.common.collect.UnmodifiableIterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r2 = r3.subscribers
            java.lang.Object r1 = r2.get(r1)
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            if (r1 == 0) goto L18
            java.util.Iterator r1 = r1.iterator()
            r0.add(r1)
            goto L18
        L36:
            java.util.Iterator r4 = r0.iterator()
            java.util.Iterator r4 = com.google.common.collect.Iterators.concat(r4)
            return r4
        L3f:
            r4 = move-exception
            java.lang.Throwable r4 = r4.getCause()
            java.lang.RuntimeException r4 = com.google.common.base.Throwables.propagate(r4)
            throw r4
    }

    public final void register(java.lang.Object r5) {
            r4 = this;
            com.google.common.collect.Multimap r5 = r4.findAllSubscribers(r5)
            java.util.Map r5 = r5.asMap()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r2 = r4.subscribers
            java.lang.Object r2 = r2.get(r1)
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
            if (r2 != 0) goto L46
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet
            r2.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r3 = r4.subscribers
            java.lang.Object r1 = r3.putIfAbsent(r1, r2)
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1
            java.lang.Object r1 = com.google.common.base.MoreObjects.firstNonNull(r1, r2)
            r2 = r1
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
        L46:
            r2.addAll(r0)
            goto L10
        L4a:
            return
    }

    public final void unregister(java.lang.Object r5) {
            r4 = this;
            com.google.common.collect.Multimap r0 = r4.findAllSubscribers(r5)
            java.util.Map r0 = r0.asMap()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> r3 = r4.subscribers
            java.lang.Object r2 = r3.get(r2)
            java.util.concurrent.CopyOnWriteArraySet r2 = (java.util.concurrent.CopyOnWriteArraySet) r2
            if (r2 == 0) goto L39
            boolean r1 = r2.removeAll(r1)
            if (r1 == 0) goto L39
            goto L10
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r5.length()
            int r1 = r1 + 65
            java.lang.String r2 = "missing event subscriber for an annotated method. Is "
            java.lang.String r3 = " registered?"
            java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2, r5, r3)
            r0.<init>(r5)
            throw r0
        L51:
            return
    }
}
