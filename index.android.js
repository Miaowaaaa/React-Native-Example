 'use strict';

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  Button,
  View,
  NativeModules
} from 'react-native';
import ToastJS from './ToastJS.js';

const onButtonPressed = () =>{
  ToastJS.show("my native Component");
};
class HelloWorld extends React.Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.hello}>cao ni ma zhong yu keyi  la !!!</Text>
        <Button style={styles.thumblic}
            onPress={onButtonPressed}
            title="click"
            color="#841584"/>
      </View>
    )
  }
}
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    flexDirection:'column',
  },
  hello: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  thumblic:{
    width:50,
    height:30,
  },
});

AppRegistry.registerComponent('Gogoo', () => HelloWorld);