package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes2.dex */
public class LoginModel implements java.io.Serializable {
    private java.lang.String active_cons;
    private java.lang.String auth;
    private java.lang.Long created_at;
    private java.lang.Long exp_date;
    private java.lang.String max_connections;
    private java.lang.String message;
    private java.lang.String password;
    private java.lang.String status;
    private java.lang.String username;

    public LoginModel() {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.exp_date = r0
            return
    }

    public java.lang.String getActive_cons() {
            r1 = this;
            java.lang.String r0 = r1.active_cons
            return r0
    }

    public java.lang.String getAuth() {
            r1 = this;
            java.lang.String r0 = r1.auth
            return r0
    }

    public java.lang.Long getCreated_at() {
            r1 = this;
            java.lang.Long r0 = r1.created_at
            return r0
    }

    public java.lang.Long getExp_date() {
            r1 = this;
            java.lang.Long r0 = r1.exp_date
            return r0
    }

    public java.lang.String getMax_connections() {
            r1 = this;
            java.lang.String r0 = r1.max_connections
            return r0
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public java.lang.String getPassword() {
            r1 = this;
            java.lang.String r0 = r1.password
            return r0
    }

    public java.lang.String getStatus() {
            r1 = this;
            java.lang.String r0 = r1.status
            return r0
    }

    public java.lang.String getUsername() {
            r1 = this;
            java.lang.String r0 = r1.username
            return r0
    }

    public void setActive_cons(java.lang.String r1) {
            r0 = this;
            r0.active_cons = r1
            return
    }

    public void setAuth(java.lang.String r1) {
            r0 = this;
            r0.auth = r1
            return
    }

    public void setCreated_at(java.lang.Long r1) {
            r0 = this;
            r0.created_at = r1
            return
    }

    public void setExp_date(java.lang.Long r1) {
            r0 = this;
            r0.exp_date = r1
            return
    }

    public void setMax_connections(java.lang.String r1) {
            r0 = this;
            r0.max_connections = r1
            return
    }

    public void setMessage(java.lang.String r1) {
            r0 = this;
            r0.message = r1
            return
    }

    public void setPassword(java.lang.String r1) {
            r0 = this;
            r0.password = r1
            return
    }

    public void setStatus(java.lang.String r1) {
            r0 = this;
            r0.status = r1
            return
    }

    public void setUsername(java.lang.String r1) {
            r0 = this;
            r0.username = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "LoginModel{username='"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r4.username
            r2 = 39
            java.lang.String r3 = ", password='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.password
            java.lang.String r3 = ", status='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.status
            java.lang.String r3 = ", auth='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.String r1 = r4.auth
            java.lang.String r3 = ", exp_date='"
            androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2, r3)
            java.lang.Long r1 = r4.exp_date
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", created_at='"
            r0.append(r1)
            java.lang.Long r1 = r4.created_at
            r0.append(r1)
            r0.append(r2)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
