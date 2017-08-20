using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNReactNativeSystemAlerts
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeSystemAlertsModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeSystemAlertsModule"/>.
        /// </summary>
        internal RNReactNativeSystemAlertsModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeSystemAlerts";
            }
        }
    }
}
