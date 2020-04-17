// Generated by Dagger (https://google.github.io/dagger).
package com.ltts.launcher.repositories.remote;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class AppApiHelper_Factory implements Factory<AppApiHelper> {
  private final Provider<APIInterface> apiInterfaceProvider;

  public AppApiHelper_Factory(Provider<APIInterface> apiInterfaceProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public AppApiHelper get() {
    return new AppApiHelper(apiInterfaceProvider.get());
  }

  public static AppApiHelper_Factory create(Provider<APIInterface> apiInterfaceProvider) {
    return new AppApiHelper_Factory(apiInterfaceProvider);
  }

  public static AppApiHelper newAppApiHelper(APIInterface apiInterface) {
    return new AppApiHelper(apiInterface);
  }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            