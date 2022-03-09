import {configureStore} from '@reduxjs/toolkit';
import {Action} from '../types/types';

export const initialState = {
    players: [
        {
            id: 'id',
            name: 'Rory',
            email: 'r@gmail.com',
            score: 0,
            numWins: 0
        }

    ]
}

const playerReducer:any = (state = initialState, action:Action) => {
    switch(action.type) {
        case 'ADD':
            return {
                ...state, 
                players : [...state.players, action.payload]
            }
        case 'DELETE':
            return {
                ...state,
                players: state.players.filter(player => player.id !== action.payload)
            }
        default:
            return state;
    }
}

const store = configureStore({reducer: playerReducer});

export default store;