/* eslint-disable react-native/no-inline-styles */
/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */
import React from 'react';
import {useState} from 'react';
import {
  SafeAreaView,
  StatusBar,
  Text,
  Button,
  NativeModules,
  ToastAndroid,
} from 'react-native';
// import RTNCalculator from 'rtn-calculator/js/NativeCalculator';

const App: () => JSX.Element = () => {
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  const [result, setResult] = useState<number | null>(null);

  const showToast = (title: string) => {
    ToastAndroid.show(title, ToastAndroid.SHORT);
  };
  return (
    <SafeAreaView>
      <StatusBar barStyle={'dark-content'} />
      <Text style={{marginLeft: 20, marginTop: 20}}>3+7={result ?? '??'}</Text>
      <Button
        title="Compute"
        onPress={async () => {
          // const value = await RTNCalculator?.add(3, 7);
          // setResult(value ?? null);
          NativeModules.HelloStarter.navigateToHelloActivity(
            'Label dari RN',
            (cb: any) => {
              showToast(cb);
            },
          );
        }}
      />
    </SafeAreaView>
  );
};
export default App;
