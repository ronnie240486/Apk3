package org.bson;

/* JADX INFO: loaded from: classes3.dex */
class NoOpFieldNameValidator implements org.bson.FieldNameValidator {
    public NoOpFieldNameValidator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.bson.FieldNameValidator
    public org.bson.FieldNameValidator getValidatorForField(java.lang.String r1) {
            r0 = this;
            return r0
    }

    @Override // org.bson.FieldNameValidator
    public boolean validate(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
