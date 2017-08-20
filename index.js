'use strict';

import { NativeModules } from 'react-native';

const { RNReactNativeSystemAlerts } = NativeModules;

var SystemAlerts = {};

SystemAlerts.alert = function(
    message,
    buttonText,
    title = '') {
    RNReactNativeSystemAlerts.alert(
        message,
        buttonText,
        title);
};

export default SystemAlerts;
