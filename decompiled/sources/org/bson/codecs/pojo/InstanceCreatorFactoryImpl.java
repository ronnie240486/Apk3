package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes3.dex */
final class InstanceCreatorFactoryImpl<T> implements org.bson.codecs.pojo.InstanceCreatorFactory<T> {
    private final org.bson.codecs.pojo.CreatorExecutable<T> creatorExecutable;

    public InstanceCreatorFactoryImpl(org.bson.codecs.pojo.CreatorExecutable<T> r1) {
            r0 = this;
            r0.<init>()
            r0.creatorExecutable = r1
            return
    }

    @Override // org.bson.codecs.pojo.InstanceCreatorFactory
    public org.bson.codecs.pojo.InstanceCreator<T> create() {
            r2 = this;
            org.bson.codecs.pojo.InstanceCreatorImpl r0 = new org.bson.codecs.pojo.InstanceCreatorImpl
            org.bson.codecs.pojo.CreatorExecutable<T> r1 = r2.creatorExecutable
            r0.<init>(r1)
            return r0
    }
}
