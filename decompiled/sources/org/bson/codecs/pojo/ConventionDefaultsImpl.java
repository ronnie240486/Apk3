package org.bson.codecs.pojo;

/* JADX INFO: loaded from: classes.dex */
final class ConventionDefaultsImpl implements org.bson.codecs.pojo.Convention {
    public ConventionDefaultsImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.codecs.pojo.Convention
    public void apply(org.bson.codecs.pojo.ClassModelBuilder<?> r4) {
            r3 = this;
            java.lang.String r0 = r4.getDiscriminatorKey()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "_t"
            r4.discriminatorKey(r0)
        Lb:
            java.lang.String r0 = r4.getDiscriminator()
            if (r0 != 0) goto L22
            java.lang.Class r0 = r4.getType()
            if (r0 == 0) goto L22
            java.lang.Class r0 = r4.getType()
            java.lang.String r0 = r0.getName()
            r4.discriminator(r0)
        L22:
            java.util.List r0 = r4.getPropertyModelBuilders()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            org.bson.codecs.pojo.PropertyModelBuilder r1 = (org.bson.codecs.pojo.PropertyModelBuilder) r1
            java.lang.String r2 = r4.getIdPropertyName()
            if (r2 != 0) goto L2a
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "_id"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L50
            java.lang.String r2 = "id"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2a
        L50:
            r4.idPropertyName(r1)
            goto L2a
        L54:
            return
    }
}
