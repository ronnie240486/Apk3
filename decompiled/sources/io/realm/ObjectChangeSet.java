package io.realm;

/* JADX INFO: loaded from: classes2.dex */
public interface ObjectChangeSet {
    java.lang.String[] getChangedFields();

    boolean isDeleted();

    boolean isFieldChanged(java.lang.String r1);
}
