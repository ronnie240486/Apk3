package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.EditorHelper;

/* JADX INFO: loaded from: classes.dex */
public final class BooleanPrefEditorField<T extends org.androidannotations.api.sharedpreferences.EditorHelper<T>> extends org.androidannotations.api.sharedpreferences.AbstractPrefEditorField<T> {
    public T put(boolean r3) {
            r2 = this;
            T extends org.androidannotations.api.sharedpreferences.EditorHelper<T> r0 = r2.editorHelper
            android.content.SharedPreferences$Editor r0 = r0.getEditor()
            java.lang.String r1 = r2.key
            r0.putBoolean(r1, r3)
            T extends org.androidannotations.api.sharedpreferences.EditorHelper<T> r3 = r2.editorHelper
            return r3
    }
}
