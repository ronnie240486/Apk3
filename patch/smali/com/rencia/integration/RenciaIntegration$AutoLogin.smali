.class public final Lcom/rencia/integration/RenciaIntegration$AutoLogin;
.super Ljava/lang/Object;
.source "RenciaIntegration.java"

.implements Ljava/lang/Runnable;

.field private final activity:Landroid/app/Activity;

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    iput-object p1, p0, Lcom/rencia/integration/RenciaIntegration$AutoLogin;->activity:Landroid/app/Activity;
    return-void
.end method

.method public run()V
    .locals 8
    :try_start_0
    const-string v0, "startNextActivity"
    const/4 v1, 0x1
    new-array v2, v1, [Ljava/lang/Class;
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
    const/4 v4, 0x0
    aput-object v3, v2, v4
    iget-object v3, p0, Lcom/rencia/integration/RenciaIntegration$AutoLogin;->activity:Landroid/app/Activity;
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    move-result-object v3
    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    move-result-object v0
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V
    new-array v1, v1, [Ljava/lang/Object;
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    aput-object v2, v1, v4
    iget-object v2, p0, Lcom/rencia/integration/RenciaIntegration$AutoLogin;->activity:Landroid/app/Activity;
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    :catch_0
    return-void
.end method
