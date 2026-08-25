package io.realm.rx;

/* JADX INFO: loaded from: classes2.dex */
public class RealmObservableFactory implements io.realm.rx.RxObservableFactory {
    private static final io.reactivex.BackpressureStrategy BACK_PRESSURE_STRATEGY = null;
    private java.lang.ThreadLocal<io.realm.rx.RealmObservableFactory.StrongReferenceCounter<io.realm.RealmList>> listRefs;
    private java.lang.ThreadLocal<io.realm.rx.RealmObservableFactory.StrongReferenceCounter<io.realm.RealmModel>> objectRefs;
    private java.lang.ThreadLocal<io.realm.rx.RealmObservableFactory.StrongReferenceCounter<io.realm.RealmResults>> resultsRefs;
    private final boolean returnFrozenObjects;


















    /* JADX INFO: loaded from: classes.dex */
    public static class StrongReferenceCounter<K> {
        private final java.util.Map<K, java.lang.Integer> references;

        private StrongReferenceCounter() {
                r1 = this;
                r1.<init>()
                java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
                r0.<init>()
                r1.references = r0
                return
        }

        public /* synthetic */ StrongReferenceCounter(io.realm.rx.RealmObservableFactory.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void acquireReference(K r4) {
                r3 = this;
                java.util.Map<K, java.lang.Integer> r0 = r3.references
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1 = 1
                if (r0 != 0) goto L15
                java.util.Map<K, java.lang.Integer> r0 = r3.references
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.put(r4, r1)
                goto L23
            L15:
                java.util.Map<K, java.lang.Integer> r2 = r3.references
                int r0 = r0.intValue()
                int r0 = r0 + r1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r2.put(r4, r0)
            L23:
                return
        }

        public void releaseReference(K r4) {
                r3 = this;
                java.util.Map<K, java.lang.Integer> r0 = r3.references
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L43
                int r1 = r0.intValue()
                r2 = 1
                if (r1 <= r2) goto L20
                java.util.Map<K, java.lang.Integer> r1 = r3.references
                int r0 = r0.intValue()
                int r0 = r0 - r2
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.put(r4, r0)
                goto L2b
            L20:
                int r1 = r0.intValue()
                if (r1 != r2) goto L2c
                java.util.Map<K, java.lang.Integer> r0 = r3.references
                r0.remove(r4)
            L2b:
                return
            L2c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid reference count: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L43:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Object does not have any references: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    static {
            io.reactivex.BackpressureStrategy r0 = io.reactivex.BackpressureStrategy.LATEST
            io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY = r0
            return
    }

    public RealmObservableFactory(boolean r2) {
            r1 = this;
            r1.<init>()
            io.realm.rx.RealmObservableFactory$1 r0 = new io.realm.rx.RealmObservableFactory$1
            r0.<init>()
            r1.resultsRefs = r0
            io.realm.rx.RealmObservableFactory$2 r0 = new io.realm.rx.RealmObservableFactory$2
            r0.<init>()
            r1.listRefs = r0
            io.realm.rx.RealmObservableFactory$3 r0 = new io.realm.rx.RealmObservableFactory$3
            r0.<init>()
            r1.objectRefs = r0
            r1.returnFrozenObjects = r2
            return
    }

    public static /* synthetic */ boolean access$100(io.realm.rx.RealmObservableFactory r0) {
            boolean r0 = r0.returnFrozenObjects
            return r0
    }

    public static /* synthetic */ java.lang.ThreadLocal access$200(io.realm.rx.RealmObservableFactory r0) {
            java.lang.ThreadLocal<io.realm.rx.RealmObservableFactory$StrongReferenceCounter<io.realm.RealmResults>> r0 = r0.resultsRefs
            return r0
    }

    public static /* synthetic */ java.lang.ThreadLocal access$300(io.realm.rx.RealmObservableFactory r0) {
            java.lang.ThreadLocal<io.realm.rx.RealmObservableFactory$StrongReferenceCounter<io.realm.RealmList>> r0 = r0.listRefs
            return r0
    }

    public static /* synthetic */ java.lang.ThreadLocal access$400(io.realm.rx.RealmObservableFactory r0) {
            java.lang.ThreadLocal<io.realm.rx.RealmObservableFactory$StrongReferenceCounter<io.realm.RealmModel>> r0 = r0.objectRefs
            return r0
    }

    private io.reactivex.Scheduler getScheduler() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto Lb
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.from(r0)
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No looper found"
            r0.<init>(r1)
            throw r0
    }

    @Override // io.realm.rx.RxObservableFactory
    public io.reactivex.Observable<io.realm.rx.ObjectChange<io.realm.DynamicRealmObject>> changesetsFrom(io.realm.DynamicRealm r3, io.realm.DynamicRealmObject r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L11
            io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
            r0 = 0
            r3.<init>(r4, r0)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r3)
            return r3
        L11:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$17 r1 = new io.realm.rx.RealmObservableFactory$17
            r1.<init>(r2, r4, r3)
            io.reactivex.Observable r3 = io.reactivex.Observable.create(r1)
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmList<E>>> changesetsFrom(io.realm.DynamicRealm r3, io.realm.RealmList<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L11
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r0 = 0
            r3.<init>(r4, r0)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r3)
            return r3
        L11:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$13 r1 = new io.realm.rx.RealmObservableFactory$13
            r1.<init>(r2, r4, r3)
            io.reactivex.Observable r3 = io.reactivex.Observable.create(r1)
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmResults<E>>> changesetsFrom(io.realm.DynamicRealm r3, io.realm.RealmResults<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L11
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r0 = 0
            r3.<init>(r4, r0)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r3)
            return r3
        L11:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$9 r1 = new io.realm.rx.RealmObservableFactory$9
            r1.<init>(r2, r4, r3)
            io.reactivex.Observable r3 = io.reactivex.Observable.create(r1)
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmList<E>>> changesetsFrom(io.realm.Realm r3, io.realm.RealmList<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L11
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r0 = 0
            r3.<init>(r4, r0)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r3)
            return r3
        L11:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$11 r1 = new io.realm.rx.RealmObservableFactory$11
            r1.<init>(r2, r4, r3)
            io.reactivex.Observable r3 = io.reactivex.Observable.create(r1)
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E extends io.realm.RealmModel> io.reactivex.Observable<io.realm.rx.ObjectChange<E>> changesetsFrom(io.realm.Realm r3, E r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L11
            io.realm.rx.ObjectChange r3 = new io.realm.rx.ObjectChange
            r0 = 0
            r3.<init>(r4, r0)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r3)
            return r3
        L11:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$15 r1 = new io.realm.rx.RealmObservableFactory$15
            r1.<init>(r2, r4, r3)
            io.reactivex.Observable r3 = io.reactivex.Observable.create(r1)
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Observable<io.realm.rx.CollectionChange<io.realm.RealmResults<E>>> changesetsFrom(io.realm.Realm r3, io.realm.RealmResults<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto L11
            io.realm.rx.CollectionChange r3 = new io.realm.rx.CollectionChange
            r0 = 0
            r3.<init>(r4, r0)
            io.reactivex.Observable r3 = io.reactivex.Observable.just(r3)
            return r3
        L11:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$7 r1 = new io.realm.rx.RealmObservableFactory$7
            r1.<init>(r2, r4, r3)
            io.reactivex.Observable r3 = io.reactivex.Observable.create(r1)
            io.reactivex.Observable r3 = r3.subscribeOn(r0)
            io.reactivex.Observable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof io.realm.rx.RealmObservableFactory
            return r1
    }

    @Override // io.realm.rx.RxObservableFactory
    public io.reactivex.Flowable<io.realm.DynamicRealm> from(io.realm.DynamicRealm r3) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.Flowable.just(r3)
            return r3
        Lb:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$5 r1 = new io.realm.rx.RealmObservableFactory$5
            r1.<init>(r2, r3)
            io.reactivex.BackpressureStrategy r3 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r3 = io.reactivex.Flowable.create(r1, r3)
            io.reactivex.Flowable r3 = r3.subscribeOn(r0)
            io.reactivex.Flowable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public io.reactivex.Flowable<io.realm.DynamicRealmObject> from(io.realm.DynamicRealm r4, io.realm.DynamicRealmObject r5) {
            r3 = this;
            boolean r0 = r4.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r4 = io.reactivex.Flowable.just(r5)
            return r4
        Lb:
            io.realm.RealmConfiguration r0 = r4.getConfiguration()
            io.reactivex.Scheduler r1 = r3.getScheduler()
            io.realm.rx.RealmObservableFactory$16 r2 = new io.realm.rx.RealmObservableFactory$16
            r2.<init>(r3, r4, r0, r5)
            io.reactivex.BackpressureStrategy r4 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r4 = io.reactivex.Flowable.create(r2, r4)
            io.reactivex.Flowable r4 = r4.subscribeOn(r1)
            io.reactivex.Flowable r4 = r4.unsubscribeOn(r1)
            return r4
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Flowable<io.realm.RealmList<E>> from(io.realm.DynamicRealm r3, io.realm.RealmList<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.Flowable.just(r4)
            return r3
        Lb:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$12 r1 = new io.realm.rx.RealmObservableFactory$12
            r1.<init>(r2, r4, r3)
            io.reactivex.BackpressureStrategy r3 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r3 = io.reactivex.Flowable.create(r1, r3)
            io.reactivex.Flowable r3 = r3.subscribeOn(r0)
            io.reactivex.Flowable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Flowable<io.realm.RealmResults<E>> from(io.realm.DynamicRealm r3, io.realm.RealmResults<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.Flowable.just(r4)
            return r3
        Lb:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$8 r1 = new io.realm.rx.RealmObservableFactory$8
            r1.<init>(r2, r4, r3)
            io.reactivex.BackpressureStrategy r3 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r3 = io.reactivex.Flowable.create(r1, r3)
            io.reactivex.Flowable r3 = r3.subscribeOn(r0)
            io.reactivex.Flowable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public io.reactivex.Flowable<io.realm.Realm> from(io.realm.Realm r3) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.Flowable.just(r3)
            return r3
        Lb:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$4 r1 = new io.realm.rx.RealmObservableFactory$4
            r1.<init>(r2, r3)
            io.reactivex.BackpressureStrategy r3 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r3 = io.reactivex.Flowable.create(r1, r3)
            io.reactivex.Flowable r3 = r3.subscribeOn(r0)
            io.reactivex.Flowable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Flowable<io.realm.RealmList<E>> from(io.realm.Realm r3, io.realm.RealmList<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.Flowable.just(r4)
            return r3
        Lb:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$10 r1 = new io.realm.rx.RealmObservableFactory$10
            r1.<init>(r2, r4, r3)
            io.reactivex.BackpressureStrategy r3 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r3 = io.reactivex.Flowable.create(r1, r3)
            io.reactivex.Flowable r3 = r3.subscribeOn(r0)
            io.reactivex.Flowable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E extends io.realm.RealmModel> io.reactivex.Flowable<E> from(io.realm.Realm r4, E r5) {
            r3 = this;
            boolean r0 = r4.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r4 = io.reactivex.Flowable.just(r5)
            return r4
        Lb:
            io.realm.RealmConfiguration r0 = r4.getConfiguration()
            io.reactivex.Scheduler r1 = r3.getScheduler()
            io.realm.rx.RealmObservableFactory$14 r2 = new io.realm.rx.RealmObservableFactory$14
            r2.<init>(r3, r4, r0, r5)
            io.reactivex.BackpressureStrategy r4 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r4 = io.reactivex.Flowable.create(r2, r4)
            io.reactivex.Flowable r4 = r4.subscribeOn(r1)
            io.reactivex.Flowable r4 = r4.unsubscribeOn(r1)
            return r4
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Flowable<io.realm.RealmResults<E>> from(io.realm.Realm r3, io.realm.RealmResults<E> r4) {
            r2 = this;
            boolean r0 = r3.isFrozen()
            if (r0 == 0) goto Lb
            io.reactivex.Flowable r3 = io.reactivex.Flowable.just(r4)
            return r3
        Lb:
            io.realm.RealmConfiguration r3 = r3.getConfiguration()
            io.reactivex.Scheduler r0 = r2.getScheduler()
            io.realm.rx.RealmObservableFactory$6 r1 = new io.realm.rx.RealmObservableFactory$6
            r1.<init>(r2, r4, r3)
            io.reactivex.BackpressureStrategy r3 = io.realm.rx.RealmObservableFactory.BACK_PRESSURE_STRATEGY
            io.reactivex.Flowable r3 = io.reactivex.Flowable.create(r1, r3)
            io.reactivex.Flowable r3 = r3.subscribeOn(r0)
            io.reactivex.Flowable r3 = r3.unsubscribeOn(r0)
            return r3
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Single<io.realm.RealmQuery<E>> from(io.realm.DynamicRealm r1, io.realm.RealmQuery<E> r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "RealmQuery not supported yet."
            r1.<init>(r2)
            throw r1
    }

    @Override // io.realm.rx.RxObservableFactory
    public <E> io.reactivex.Single<io.realm.RealmQuery<E>> from(io.realm.Realm r1, io.realm.RealmQuery<E> r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "RealmQuery not supported yet."
            r1.<init>(r2)
            throw r1
    }

    public int hashCode() {
            r1 = this;
            r0 = 37
            return r0
    }
}
