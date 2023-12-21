/**
 * @format
 */
 import React, {useState, useEffect} from 'react';
 import {NavigationContainer} from '@react-navigation/native';
 import ApplicationNavigator from './src/Navigations/ApplicationNavigator';
 import {SafeAreaView, StatusBar, StyleSheet, NativeModules, Platform} from 'react-native';
 import NetInfo from "@react-native-community/netinfo";
 import ModalComponent from './src/Components/ModalComponent';
 import {AppContextProvider} from './src/Context/AppContext';


 var {RFIDSDKModule} = NativeModules;

 const App = () => {

    let [modalVisible, setModalVisible] = useState(false);

  useEffect(()=> {
  
    const unsubscribe = NetInfo.addEventListener(state => {
      if (!state.isInternetReachable) {
        setModalVisible(true);
      } else {
       setModalVisible(false);
      }
    });

    return ()=> {
      unsubscribe();
    }

  }, []);

   return (
     <SafeAreaView style={styles.safeArea}>
       <StatusBar barStyle="dark-content" />
       <NavigationContainer>
       <ModalComponent
        modalVisible={modalVisible}
        setModalVisible={param => {
          setModalVisible(param);
        }}
        errorText={"Please check your Internet connection"}
      />
      <AppContextProvider>
        <ApplicationNavigator />
      </AppContextProvider>
       </NavigationContainer>
     </SafeAreaView>
   );
 };
 const styles = StyleSheet.create({
   safeArea: {
     flex: 1,
     overflow: 'hidden',
   },
 });
 export default App;
 