import {NativeModules} from 'react-native';

//--------------------------------------------------------------------------------------------------
// Java

export const Toast = (msg: string) => {
  NativeModules.MxJToast.show(msg);
};
export const ToastLong = (msg: string) => {
  NativeModules.MxJToast.showLong(msg);
};
export const testLogcat = (msg: string) => {
  NativeModules.MxJToast.testLogcat(msg);
};
export const testPromiseJ = async (): Promise<string> => {
  return await NativeModules.MxJToast.testPromise();
};
export const testPromise2J = async (p: string): Promise<string> => {
  return await NativeModules.MxJToast.testPromise2(p);
};
export const testCallbackJ = (cb: (r: string) => void) => {
  NativeModules.MxJToast.testCallback(cb);
};

// Kotlin
export const ToastK = (msg: string) => {
  NativeModules.MxKToast.show(msg);
};
export const ToastLongK = (msg: string) => {
  NativeModules.MxKToast.showLong(msg);
};
export const testPromise = async (): Promise<string> => {
  return await NativeModules.MxKToast.testPromise();
};
export const testPromise2 = async (p: string): Promise<string> => {
  return await NativeModules.MxKToast.testPromise2(p);
};
export const test = async (): Promise<string> => {
  return await NativeModules.MxKToast.test();
};
export const testCallback = (cb: (r: string) => void) => {
  NativeModules.MxKToast.testCallback(cb);
};
