
#import "RNReactNativeSystemAlerts.h"

@implementation RNReactNativeSystemAlerts

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(
    alert:
    (NSString*)message:
    (NSString*)buttonText:
    (NSString*)title) {
    dispatch_async(dispatch_get_main_queue(), ^{
        [[[UIAlertView alloc] initWithTitle:title
                                    message:message
                                   delegate:nil
                          cancelButtonTitle:buttonText
                          otherButtonTitles:nil] show];
    });
}

@end
